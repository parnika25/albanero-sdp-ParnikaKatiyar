import java.util.*;  
public class Sorting
{  
    public static void main(String args[])
    {  
        List<String> list1=new ArrayList<String>();  
        list1.add("Ram");  
        list1.add("Harry");  
        list1.add("Eric");  
        list1.add("Tom");    
        Collections.sort(list1);
        System.out.println("Sorting the names ");
        for(String name:list1) 
        {
            System.out.print(name+" ");  
        }
       System.out.println("\nSorting numbers...");  
  
       List<Integer> list2=new ArrayList<Integer>();  
       list2.add(41);  
       list2.add(2);  
       list2.add(89);  
       list2.add(60);   
       Collections.sort(list2);   
       for(Integer n:list2)
       {
          System.out.print(n+ " ");  
        
       }
    }  
   
}