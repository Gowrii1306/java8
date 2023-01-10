package java8;

public class ImplementationStr {
	public String findMax(String[] a) {
		String max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max.length()) {
				max = a[i];
			}
		}
		return max;
	}
	public String findMin(String[] a) {
		String min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<min.length()) {
				min = a[i];
			}
		}
		return min;
	}
}
