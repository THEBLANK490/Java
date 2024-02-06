//3.	Create a class Product with name, qty and price. Create a parameterized 
//constructor to set the product details. Provide the method getName(), 
//getQty() and getPrice() that return product name, qty and price. 
//Also create method getTotal() that returns the total price. 
//Then create a class ProductDemo with main method that creates two object 
//of Product and find the total price of both products.
package z;

class Product{
    private String name;
    private int qty;
    private float price;
    
    
    public Product(String name, int qty,float price){
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public int getQty(){
        return qty;
    }
    
    public float getPrice(){
        return price;
    }
    
    public float getTotalPrice(){
        return qty*price;
    }
}
public class Practical1_Q3 {
    public static void main(String[] args) {
        Product p1 = new Product("apple",5,20.3f);
        Product p2 = new Product("tv",3,150000.20f);
        float f1 = p1.getTotalPrice();
        float f2 = p2.getTotalPrice();
        System.out.println("The total price of "+ p1.getName() +" is: " + f1);
        System.out.println("The total price of " + p2.getName()+" is: " + f2);
    }
}
