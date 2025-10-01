package Java_Practice.Homework;

public class All_Variables {
	int inst_var = 30;

	static int staticvar = 40;

	void display() {
		int local_var = 20;
		System.out.println(inst_var);
		System.out.println(staticvar);
		System.out.println(local_var);
	}

	public static void main(String[] args) {
		All_Variables ob=new All_Variables();
		ob.display();
		System.out.println("-----------");		
		ob.inst_var=70;
		staticvar=100;
		All_Variables ob1=new All_Variables();
		ob1.inst_var=80;
		ob1.display();


	}

}
