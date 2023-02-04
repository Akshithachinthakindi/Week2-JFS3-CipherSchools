import java.util.ArrayList;

public class vector2 {

// ques: 
// Write a java program to ask user if he/she wants o add Item in shopping cart
// item : product Tile and price
// show the total product name in ascending order
// total amount of all products

// addMore ? y addMore ? y addMore ? n
// Total Bill : XX
// Products List(ascending order)
    
     public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        Product p = new Product();
        p.title = "Akshitha";
        p.price = 22000;
        products.add(p);
     }

}
class Product {
    String title;
    int price;
}
