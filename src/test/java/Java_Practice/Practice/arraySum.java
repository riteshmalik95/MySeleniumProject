package Practice;

public class arraySum {

	public static void main(String[] args) {
		int[] arr = {2,5,8,15,17};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
	  System.out.println("Sum of the array elements:"+sum);

	}

}
