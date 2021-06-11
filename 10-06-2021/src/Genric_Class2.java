//Multiple parameters in Java genrics
public class Genric_Class2<T, U> 
{
   T t1;
   U t2;
   public void get(T t1, U t2) 
   {
      this.t1 = t1;
      this.t2 = t2;
   }

   public void print() 
   {
	   System.out.println(t1);
	   System.out.println(t2);
   }

   public static void main(String[] args) 
   {
	   Genric_Class2<Integer, Float> ob1 = new Genric_Class2<Integer, Float>();
    
      ob1.get(10,20.5f);
      ob1.print();

   }
}