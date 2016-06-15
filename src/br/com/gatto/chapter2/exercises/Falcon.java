package br.com.gatto.chapter2.exercises;

/**
 * Exercise 20 
 * Explanation: A. Although the definition of methods on lines 2 and
 * 5 vary, both will be converted to public abstract by the compiler. Line 4 is
 * fine, because an interface can have public or default access. Finally, the
 * class Falcon doesn’t need to implement the interface methods because it is
 * marked as abstract. Therefore, the code will compile without issue.
 */
abstract class Falcon implements CanFly, HasWings {

}
