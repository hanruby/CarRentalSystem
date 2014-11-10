
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Customer
{
		DataManagement d = new DataManagement();
        private String _name;
        private String  _email;
        private Vector _rentals = new Vector();
        boolean well;
        String [] registeredCheck;
        public Customer (String name, String email)
        {
                _name = name;
                _email = email;
        };
//        public void addRental(Rental arg)
//        {
//                _rentals.addElement(arg);
//        }
        public String getName ()
        {
                return _name;
        }
         public String getEmail() {
        return _email;
        }
 
         public void setEmail(String _email) {
        this._email = _email;
        }
         public void register()
         {
        	 d.registerCustomer(this);
         }
       
       
     
