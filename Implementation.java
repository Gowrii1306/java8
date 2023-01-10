package java8;

public class Implementation {
	public int findMax(int a[]) {
		int max = a[0];
		for(int i :a) {
			if(i>=max) {
			max=i;
		}
	}
	return max;
	}
	public static int findMin(int a[]) {
		int min = a[0];
		for(int i =0;i<a.length;i++) {
			if(a[i]<=min) {
				min = a[i];
			}
		}
		return min;
	}
}
