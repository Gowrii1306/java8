package java8;

public interface NetPrice {
	public int findNetPrice(int tax,int discount,int price) ;
	public default void operation() {
		System.out.println("The interface finds netPrice");
	}

}
