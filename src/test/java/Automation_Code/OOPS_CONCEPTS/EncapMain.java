package OOPS_CONCEPTS;

public class EncapMain {

	public static void main(String[] args) {
		EncapDemo acc = new EncapDemo();
		acc.setAccno(1245645);
		System.out.println(acc.getAccno());
		acc.setAmount(50000);
		System.out.println(acc.getAmount());
		acc.setName("Ritesh Malik");
		System.out.println(acc.getName());
	}

}
