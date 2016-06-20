package br.com.gatto.chapter3;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTests {
	public static void main(String[] args) {
		System.out.println("************ ArrayDeque using offer ****************");
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));
		System.out.println(queue.offer(4));
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		System.out.println("************ ArrayDeque using push ****************");
		ArrayDeque<Integer> queue2 = new ArrayDeque<>();
		queue2.push(10);
		queue2.push(4);
		System.out.println(queue2.peek());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.peek());
		
	}
}
