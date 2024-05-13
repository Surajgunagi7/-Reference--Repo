package sdmcet.cse.oop.generics;

class Generics<T extends Number> {
	T ob;

	Generics(T ob) {
		this.ob = ob;
	}

	// Getter and Setter methods
	T getOb() {
		return this.ob;
	}

	// To display the type of the object methods
	void showType() {
		System.out.println("Type of T : " + ob.getClass().getName());
	}

}

public class BoundedTypesDemo {

	public static void main(String[] args) {
		Generics<Integer> iOb = new Generics<Integer>(10);
		iOb.showType();
		System.out.println("Value : " + iOb.getOb());
		
		
		Generics<Double> dOb = new Generics<Double>(110.93);
		dOb.showType();
		System.out.println("Value : " + dOb.getOb());
		
		
//		Generics<String> sOb = new Generics<String>("Hello World");
//		sOb.showType();
//		System.out.println("Value : " + sOb.getOb());
		
	
		Generics<Float> fOb = new Generics<Float>(10.13f);
		fOb.showType();
		System.out.println("Value : " + fOb.getOb());
		
	}

}
