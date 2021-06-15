import java.util.stream.Collectors;  
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
public class CollectorEg 
{  
    public static void main(String[] args) 
    {  
        List<Product> pl = new ArrayList<Product>();  
        pl.add(new Product(1,"HP Laptop",25000f));  
        pl.add(new Product(2,"Dell Laptop",30000f));  
        pl.add(new Product(3,"Lenevo Laptop",40000f));  
        pl.add(new Product(4,"Sony Laptop",50000f));  
        pl.add(new Product(5,"Apple Laptop",40000f));  
        Double sumPrices = pl.stream().collect(Collectors.summingDouble(x->x.price)); 
        System.out.println("Sum of prices: "+sumPrices);  
        Integer sumId =pl.stream().collect(Collectors.summingInt(x->x.id));  
        System.out.println("Sum of id's: "+sumId);  
    }  
}