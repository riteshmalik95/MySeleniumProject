package OOPS_CONCEPTS;
/*Only through methods,we can 
 * operate the variable */
public class EncapDemo {
	private int accno;
	private String name;
	private double amount;
	public int getAccno() {
    //only for reading the Data
		return accno;
	}
	public void setAccno(int accno) {
		//this keyword always represents the class(variables)
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}