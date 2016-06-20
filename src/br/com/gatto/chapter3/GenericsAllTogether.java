package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.List;

class A {

}

class B extends A {

}

class C extends B {

}

public class GenericsAllTogether {
	public static void main(String[] args) {
		List<?> list1 = new ArrayList<A>();
		List<?> list12 = new ArrayList<B>();
		List<?> list13 = new ArrayList<C>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? extends A> list21 = new ArrayList<B>();
		List<? extends A> list22 = new ArrayList<C>();
		List<? super A> list3 = new ArrayList<A>();
		// List<? super A> list31 = new ArrayList<B>(); // B is not a super class of A
		// List<? super A> list32 = new ArrayList<C>(); // C is not a super class of A
		// List<? extends B> list4 = new ArrayList<A>(); // A do not extend B
		List<? extends B> list41 = new ArrayList<C>();
		List<? super B> list5 = new ArrayList<B>();
		// List<?> list6 = new ArrayList<? extends A>();
	}
	
	<T> T method1(List<? extends T> list) {
		return list.get(0);
	}
	
	// <T> <? extends T> method2(List<? extends T> list) {
	// return list.get(0);
	// }
	
	// <B extends A> B method3(List<B> list) {
	// return new B();
	// }
	
	void method4(List<? super B> list) {
		
	}
	
	// <X> void method5(List<x super B> list) {
	//
	// }
}
