package sdmcet.cse.oop.generics;

class TwoGenerics<T extends Number, V> {
	T ob1;
	V ob2;

	TwoGenerics(T ob1, V ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
		return ob2;
	}

	void showType1() {
		System.out.println("Type of T : " + ob1.getClass().getName());
	}

	void showType2() {
		System.out.println("Type of V : " + ob2.getClass().getName());
	}

}

public class TwoGenericsDemo {

	public static void main(String[] args) {

		TwoGenerics<Integer, String> ob1 = new TwoGenerics<Integer, String>(22, "xyz");
		ob1.showType1();
		ob1.showType2();
		System.out.println("Value of T : " + ob1.getOb1() + "  Value of V : " + ob1.getOb2());

	}

}
