package java8;

public class UseNetPrice {

	public static void main(String[] args) {
	NetPrice amount = (tax,discount,price)->price+tax-discount;
	NetPrice percent= (tax,discount,price)->price+(price+tax/100)-(price+discount/100);
	System.out.println(amount.findNetPrice(10, 50, 1000));
	System.out.println(percent.findNetPrice(12, 330, 1000));
	amount.operation();

	}

}
