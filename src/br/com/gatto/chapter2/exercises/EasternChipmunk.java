package br.com.gatto.chapter2.exercises;


/**
 * Exercise 1
 * Explanation:
 */
public class EasternChipmunk extends Chipmunk {

	@Override
	public void chew() {
		System.out.println("Eastern Chipmunk is Chewing");		
	}

	
	// ALL ABSTRACT METHODS MUST BE IMPLEMENTED IN THE FIRST CONCRETE CLASS
	@Override
	public void climb() {
		
	}
	

}
