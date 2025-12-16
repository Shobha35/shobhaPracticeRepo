package JavaProgramAssignment;

class Product 
{
    int productId;
    String productName;
    double price;

    Product() 
    {
        System.out.println("Product ID created");

    }

    Product(int productId, String productName, double price) 
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    

    public void displayProduct() 
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Name:       " + productName);
        System.out.println("Price:      " + price);
    }
}

public class ConstructorOverloading3 
{
    public static void main(String[] args) 
    {
        
        Product p1 = new Product();
        p1.displayProduct();


        Product p3 = new Product(102, "Samrat", 499.99);
        p3.displayProduct();
    }
}