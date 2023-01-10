package java8;

public class UseMaxMin {
	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		MaxMin max=(int[] a)-> {
			int temp=nums[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]>temp) {
					temp = a[i];
				}
			}
		
		System.out.println("Max:"+temp);
		};
		max.find(nums);
		MaxMin min=(int [] a)-> {
			int temp=nums[1];
			for(int i=0;i<a.length;i++) {
				if(a[i]<=temp) {
					temp = a[i];
				}
			}
		
		System.out.println("Mi:"+temp);
		};
		min.find(nums);
	}

}
