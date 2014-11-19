import java.io.*;

public class DataManagement
{
	Command command;
	boolean well;
	String [] registeredCheck;
	String [] rentals;
	String [] details;
	String [] detailsToReturn;
	boolean isNew;
	public void registerCustomer(Customer c)
	{
		String _customerName = c.getName();
		String _customerEmail = c.getEmail();
		try
		{
			boolean ta = checkRegistered(_customerName,_customerEmail);
			if(ta == false)
			{
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("RegisteredCustomers.csv", true)));
				out.print(_customerName + "," + _customerEmail + ",");
				out.close();
			}
			else
			{
				//alreadyregistered
			}
		}
		catch (IOException e)
		{
		    //failed 
		}
		
	}
	public void setCommand(Command command)
	{
		this.command = command;
	}
	public void runIt()
	{
		command.execute();
	}

	
	
	public boolean checkRegistered(String name, String email) throws IOException
	{
		String _name = name;
		String _email = email;
		try
		{
			File csv = new File("RegisteredCustomers.csv");
			BufferedReader csvRead  = new BufferedReader(new FileReader(csv));
			String lineRead = csvRead.readLine();
			while(lineRead != null)
			{
				this.registeredCheck = lineRead.split(",");
				lineRead = csvRead.readLine();
			}
			csvRead.close();
		}
		catch(Exception e)
		{
			//JOptionPane.showMessageDialog(null,"There is an error with the system, reservation data is missing. Please check the locations of the data files.");
			//new NewJFrame().setVisible(true);
		}
		try{
		for(int i=0; i<=registeredCheck.length;i++)
		{
			if((registeredCheck[i].equalsIgnoreCase(_name)) && (registeredCheck[i+1].equalsIgnoreCase(_email)))
			{
				well = true;
				break;
			}
			else
			{
				well = false;
			}
		}
		}
		catch(Exception e)
		{
			
		}
		return well;
	}
	
	public String[] getRentals(Customer c)
	{
		detailsToReturn = new String[6];
		Customer test = c;
		try
		{
			File rentFile = new File("Rentals.csv");
			BufferedReader readRent = new BufferedReader(new FileReader(rentFile));
			String lineRead = readRent.readLine();
			while(lineRead != null)
			{
				this.rentals = lineRead.split(",");
				lineRead = readRent.readLine();
			}
			readRent.close();
		}
		catch(Exception r)
		{
			System.out.print("Failed jRead");
		}
		System.out.println(rentals.length);
		try
		{
			for(int i = 0; i<=rentals.length;i++)
			{
				if((rentals[i].equalsIgnoreCase(test.getName()))&&(rentals[i+1].equalsIgnoreCase(test.getEmail())))
				{
					detailsToReturn[0] = rentals[i]; //this line of code fails. Seems to be a problem with referencing detailsToReturn
					System.out.print("hello");
					return detailsToReturn;
				}
			}
		}
		catch(Exception e)
		{
			System.out.print("Failed jsave");
		}
		return detailsToReturn;

	}
	
	public void saveRental(String _owner, String _EML,int days,String _model,double _cost,String _type)
	{
		String owner = _owner;
		String EML = _EML;
		int lengthOfRental = days;
		String model = _model;
		double cost = _cost;
		String type = _type;
		boolean check = checkRental(owner,EML,lengthOfRental,model,cost,type);
		if(check == false)
		{
			try
		    {
				FileWriter writer = new FileWriter("Rentals.csv",true);
				writer.append(owner+","+EML+","+lengthOfRental+","+model+","+cost+","+type+",");
				writer.close();
		    }
			catch(Exception e)
			{
				//failed
			}
		}
		else
		{
			System.out.println("didn't save");
		}
	}
	public boolean checkRental(String _owner, String _EML,int days,String _model,double _cost,String _type)
	{
		try
		{
			File csv = new File("Rentals.csv");
			BufferedReader csvRead  = new BufferedReader(new FileReader(csv));
			String lineRead = csvRead.readLine();
			while(lineRead != null)
			{
				this.rentals = lineRead.split(",");
				lineRead = csvRead.readLine();
			}
			csvRead.close();
		}
		catch(Exception e)
		{
		}
		try
		{
			for(int i=0; i<=rentals.length;i++)
			{
				if ((rentals[i].equalsIgnoreCase(_owner)) && (rentals[i+1].equalsIgnoreCase(_EML)) && (Integer.parseInt(rentals[i+2])==days) && (rentals[i+3].equals(_model)) && (Double.parseDouble(rentals[i+4])==_cost) && (rentals[i+5].equalsIgnoreCase(_type)))
				{
					isNew = true;
					break;
				}
				else
				{
					isNew= false;
				}
			}
		}
		catch(Exception e)
		{
			isNew = false;
		}
		return isNew;
	}
}
