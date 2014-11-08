import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class DataManagement
{
	boolean well;
	String [] registeredCheck;
	public void registerCustomer(String customerName, String customerEmail)
	{
		String _customerName = customerName;
		String _customerEmail = customerEmail;
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
				//Already Registered
			}
		}
		catch (IOException e)
		{
		    //failed 
		}
		
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

}
	
	
