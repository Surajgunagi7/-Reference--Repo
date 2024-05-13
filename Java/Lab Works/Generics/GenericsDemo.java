package sdmcet.cse.oop.generics;

class SimpleGenerics<T> {
	T ob;

	SimpleGenerics(T ob) {
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

public class GenericsDemo {

	public static void main(String[] args) {
		SimpleGenerics<Integer> iOb = new SimpleGenerics<Integer>(10);
		iOb.showType();
		System.out.println("Value : " + iOb.getOb());
		
		
		SimpleGenerics<Double> dOb = new SimpleGenerics<Double>(110.93);
		dOb.showType();
		System.out.println("Value : " + dOb.getOb());
		
		
		SimpleGenerics<String> sOb = new SimpleGenerics<String>("Hello World");
		sOb.showType();
		System.out.println("Value : " + sOb.getOb());
		
	
		SimpleGenerics<Float> fOb = new SimpleGenerics<Float>(10.13f);
		fOb.showType();
		System.out.println("Value : " + fOb.getOb());
		
	}

}
