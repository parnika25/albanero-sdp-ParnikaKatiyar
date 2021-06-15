import java.util.*;  
public class Parallel_sort
{  
    public static void main(String[] args) 
    {   
        int[] arr = {25,83,-1,10,6,21,50,-3};  
        for (int i=0;i<arr.length;i++) 
        {  
            System.out.print(arr[i]+" ");  
        }  
          
        Arrays.parallelSort(arr,0,5);  
        System.out.println("\nArray elements after sorting");   
        for (int i=0;i<arr.length;i++) 
        {  
            System.out.print(arr[i]+" ");  
        }
    }
}  