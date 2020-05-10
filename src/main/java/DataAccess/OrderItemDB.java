package DataAccess;

import java.util.ArrayList;
import java.util.List;

import BusinessLayer.OrderItem;



public class OrderItemDB {
	 List<OrderItem> orderItemList = new ArrayList<OrderItem>();
	    
     public  List<OrderItem> orderItems() {
                
            orderItemList.add(new OrderItem(1,1,22,"samsung s10 plus",1));
            orderItemList.add(new OrderItem(2,2,33,"earbuds",2));
            orderItemList.add(new OrderItem(3,3,44,"lenovo laptop",2));
            return orderItemList;
        }
    
     public  List<OrderItem> getAllOrdersItems() {
            return orderItemList;
        }
	
}
