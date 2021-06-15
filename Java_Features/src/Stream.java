import java.util.*;  
class Product
{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) 
    {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Stream 
{  
    public static void main(String[] args) 
    {  
        List<Product> pd = new ArrayList<Product>();  
        //Adding Products  
        pd.add(new Product(1,"HP Laptop",25000f));  
        pd.add(new Product(2,"Dell Laptop",30000f));  
        pd.add(new Product(3,"Lenevo Laptop",40000f));  
        pd.add(new Product(4,"Sony Laptop",45000f));  
        pd.add(new Product(5,"Apple Laptop",30000f));   
        pd.stream().filter(product -> product.price >= 30000).forEach(product -> System.out.println(product.name)); 
        Product p1 = pd.stream().max((product1, product2)-> product1.price > product2.price ? 1: -1).get(); 
        System.out.println(p1.price);
        Product p2 = pd.stream().max((product1, product2)-> product1.price < product2.price ? 1: -1).get();
        System.out.println(p2.price);
    }  
} 