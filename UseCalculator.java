package java8;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator add = (a,b)->a+b;
		Calculator sub = (a,b)->a-b;
		Calculator mul = (a,b)->a*b;
		System.out.println(add.math(100, 200));
		System.out.println(sub.math(100, 50));
		System.out.println(mul.math(10, 2));
		add.activity();

	}

}
