package DataAccess;

import java.util.ArrayList;
import java.util.List;

import BusinessLayer.Product;


public class ProductDB {
List<Product> productList = new ArrayList<Product>();
    
    public  List<Product> products() {
                
            productList.add(new Product(22,"In person Item",1,350));
            productList.add(new Product(33,"In person Item",2,878));
            productList.add(new Product(44,"In person Item",3,1000));
            return productList;
        }
    
    public  List<Product> getAllProducts() {
            return productList;
        }
}
