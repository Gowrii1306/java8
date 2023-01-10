package java8;

public interface Calculator {

	public int math(int a,int b);
	public default void activity() {
		System.out.println("activity");
	}
}
