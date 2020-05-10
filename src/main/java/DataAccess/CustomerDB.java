package DataAccess;

import java.util.ArrayList;
import java.util.List;


import BusinessLayer.Customer;

public class CustomerDB {
	 List<Customer> customerList = new ArrayList<Customer>();
     
     
     
     
     
     public  List<Customer> createCustomer() {
         customerList.add(new Customer(101, "Rohan", "singirani", "5555555"));
         customerList.add(new Customer(102, "radha", "singirani", "4444444"));
         customerList.add(new Customer(103, "ravi", "singirani", "34234234234"));
         return customerList;
     }
     
     public  List<Customer> getAllCustomers() {
         return customerList;
     }

}
