package br.com.gatto.assessment;

class Animal {
	public String name;
}

class Canine extends Animal {
	public Tail tail;
}

/**
 * A is correct because name is public and therefore inherited by the Wolf
 * class. B is correct because Wolf is-a Canine and Canine has-a Tail;
 * therefore, since tail is public, it is inherited and Wolf has-a Tail. C is
 * incorrect, because Wolf is not inherited from Tail. D is correct, because
 * Wolf is-a Canine and Canine is-a Animal; therefore, Wolf is-a Animal. E is
 * incorrect, because the relationship is reversed. F is incorrect, since Animal
 * does not have a Tail attribute.
 */
class Wolf extends Canine {

}
