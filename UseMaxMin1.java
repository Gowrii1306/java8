package java8;

public class UseMaxMin1 {

	public static void main(String[] args) {
		Implementation imp = new Implementation();
		MaxMin1 max = imp::findMax;
		int[] numbers={-1,2,3,6,5,6,-9,95};
		System.out.println("Maximum: "+max.find(numbers));
		MaxMin1 min = Implementation ::findMin;
		System.out.println("Minimum: "+min.find(numbers));

	}

}
