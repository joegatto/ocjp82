package br.com.gatto.chapter1;

public class Lion extends Cat {

	private int idNumber;
	private int age;
	private String name;

	public Lion(int idNumber, int age, String name) {
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;
	}

	/**
	 * Reflexiva: Para referencias n�o nulas de x, x.equals(x) deve retornar
	 * true. Sim�trica: Para referencias n�o nulas de x e y, x.equals(y) deve
	 * retornar true se e somente se y.equals(x) retornar true. Transitiva: Para
	 * referencias n�o nulas de x, y e z, se x.equals(y) retorna true e
	 * y.equals(z) retorna true, ent�o x.equals(z) deve retornar true.
	 * Consistente: Para referencias n�o nulas de x e y, multiplas chamadas de
	 * x.equals(y) constantemente retornam true ou false, contanto que nenhuma
	 * informa��o usada para compara��es tenha sido alteradas. x.equals(null)
	 * deve retornar false.
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Lion))
			return false;
		Lion otherLion = (Lion) obj;
		return this.idNumber == otherLion.idNumber;
	}

	void clean() {

	}

	@Override
	public int hashCode() {
		return idNumber * 7 + age;
	}

}
