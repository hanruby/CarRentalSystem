
public class RegisterCustomerCommand implements Command
{
	Customer target;
	public RegisterCustomerCommand(Customer c)
	{
		this.target = c;
	}
	@Override
	public void execute()
	{
		target.register();
		
	}

}
