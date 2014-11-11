
public class Test {

	public static void main(String[] args) {
		DataManagement data = new DataManagement();
		Customer c = new Customer("Jonathan","Email");
		RegisterCustomerCommand registerCustomer = new RegisterCustomerCommand(c);
		data.setCommand(registerCustomer);
		data.runIt();
		makeCarRental m1 = new makeCarRental();
		Rental c1 = m1.makeRental();
		c1.saveRental();

	}

}
