import java.util.List;
import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataAccess.CustomerDB;
import DataAccess.OrderDB;
import DataAccess.OrderItemDB;
import DataAccess.ProductDB;

public class Main {
	public static void main(String[] args){
		   CustomerDB customer   = new CustomerDB();
		   OrderDB order      = new OrderDB();
		   OrderItemDB orderItem = new OrderItemDB();
		   ProductDB   product  = new ProductDB();
		   
		   customer.createCustomer();
		   order.customerOrder();
		   orderItem.orderItems();
		   product.products();
		   
		   
		   //read everything from DB
		   System.out.println("Getting customers");
		       List<Customer> customerDB = customer.getAllCustomers();
		       for(Customer dbCustomer : customerDB){
		           System.out.println(dbCustomer);
		       }
		       
		   System.out.println("\n Getting Orders");
		       List<Order> orderDA = order.getAllOrders();
		       for(Order dbOrder : orderDA){
		           System.out.println(dbOrder);
		       } 
		       
		   System.out.println("\n Getting Orders Items");
		       List<OrderItem> orderItemDB = orderItem.getAllOrdersItems();
		       for(OrderItem dbOrderItm : orderItemDB){
		           System.out.println(dbOrderItm);
		       }     
		       
		   System.out.println("\n Getting Products");
		       List<Product> productDB = product.getAllProducts();
		       for(Product dbProduct : productDB){
		           System.out.println(dbProduct);
		       }     
		      
		    
		   }
}
