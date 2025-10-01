package Arrays;

public class passArray {
	static int findMin (int[] arr) {
		if(arr.length==0)
	    System.out.println("Array is Empty");
     int min = arr[0];
     for(int i=1;i<arr.length;i++) {
    	 if(min>arr[i]) {
    	  min=arr[i];
    	 }
    	 }
         return min;
    	 }
	
	public static void main(String[] args) {
		int[] arr= {45,12,15,18};
		int result=findMin(arr);
		System.out.println(result);
	}
	
	}

	
