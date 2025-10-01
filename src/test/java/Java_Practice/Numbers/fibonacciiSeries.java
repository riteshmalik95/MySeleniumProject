package Numbers;

public class fibonacciiSeries {

	public static void main(String[] args) {
		int terms=10;
		for(int i=0;i<terms;i++)
		{
			System.out.println(fibo(i)+"");
		}

	}

	public static int fibo (int n) {
		if(n<=1) {
		return n ;
		}
		int a=0,b=1;
		for(int i=2;i<=n;i++) {
			int next=a+b;
			a=b;
			b=next;
		}
		 return b;
	}
  //0,1,1,2,3,5,8.................
}
