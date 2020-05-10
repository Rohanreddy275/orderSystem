package DataAccess;

import java.util.ArrayList;
import java.util.List;



import BusinessLayer.Order;

public class OrderDB {
	List<Order> ordersList = new ArrayList<Order>();
    
    public  List<Order> customerOrder() {
               
           ordersList.add(new Order(1,101,"01/01/2020"));
           ordersList.add(new Order(2,102,"02/02/2020"));
           ordersList.add(new Order(3,103,"03/03/2020"));
           return ordersList;
       }
   
    public  List<Order> getAllOrders() {
           return ordersList;
       }

}
