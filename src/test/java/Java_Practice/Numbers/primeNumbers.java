package Numbers;

public class primeNumbers {

	public static void main(String[] args) {
		int counter=1;
		for(int i=2;i<=100;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
                if (i % j == 0) {

                    flag = false;
                    break;
                }
			}
			if(flag)
			{
				System.out.print(counter++);
				System.out.println(". "+i);
			}
		}
			

	}

}
