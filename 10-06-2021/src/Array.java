//Sorting the arrray in descending order
public class Array 
{
   public static < E extends Comparable<E>> void sortArray( E[] inputArray ) 
   {
	   E temp;
      for(int i=0;i<(inputArray.length -1);i++)
      {
    	  for(int j=0;j<(inputArray.length-i-1);j++)
          {  
    		  if(inputArray[j].compareTo(inputArray[j+1])>0)
    		  {
    			  temp=inputArray[j];
    			  inputArray[j]=inputArray[j+1];
    			  inputArray[j+1]=temp;
    		  }
    		  
          }
      }
      for(int i=0;i<inputArray.length;i++)
      {
         System.out.printf("%S ", inputArray[i]);
      }
      System.out.println();
   }

   public static void main(String args[]) 
   {
      Integer[] intArray = { 13, 62, 43, 74, 25 };
      Double[] doubleArray = { 114.1, 82.2, 31.3, 94.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      sortArray(intArray);

      System.out.println("\nArray doubleArray contains:");
      sortArray(doubleArray);  

      System.out.println("\nArray characterArray contains:");
      sortArray(charArray);  
   }
}