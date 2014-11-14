
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
		StatementWrapper b = new StatementWrapper();
		StatementWrapper one = BasicStatement.getSingletonInstance();
		StatementWrapper two = CarStatement.getSingletonInstance(one);
		StatementWrapper three = BusStatement.getSingletonInstance(one);
		StatementWrapper four = BikeStatement.getSingletonInstance(one);
		two.generateStatement(c1);
		Bus v1 = new Bus("Renault",50);
		System.out.println(v1.getMaxCapacity());
		System.out.println(v1.getCostPerDay());
		Vehicle f = new Bus("Renault",30);
		String [] sad = f.info();
		System.out.print(sad[0]);
		System.out.print(sad[1]);
		

	}

}
