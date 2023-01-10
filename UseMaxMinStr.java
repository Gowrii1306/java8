package java8;

public class UseMaxMinStr {

	public static void main(String[] args) {
		ImplementationStr imp = new ImplementationStr();
		MaxMinStr max = imp:: findMax;
		String[] a = {"Gowrii","Pragadeeesh","Chennaiiiiii"};
		System.out.println("Max String: "+max.find(a));
		MaxMinStr min = imp:: findMin;
		System.out.println("Min String: "+min.find(a));

	}

}
