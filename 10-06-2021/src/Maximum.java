
public class Maximum 
{
	public <T extends Comparable<T>> T max(T x, T y, T z)
	{
		T maximum = ((z.compareTo(((x.compareTo(y) > 0) ? x:y)) > 0) ? z:((x.compareTo(y) > 0) ? x:y));
		return maximum;
		
	}
	public static void main(String[]args)
	{
		Maximum m=new Maximum();
		System.out.printf("Maximum of %d, %d and %d : %d\n",30,10,15,m.max(30,10,15));
		System.out.printf("Maximum of %f, %f and %f : %f\n",4.54,45.32,15.45,m.max(4.54,45.32,15.45));
		System.out.printf("Maximum of %c, %c and %c : %c\n",'a','x','h',m.max('a','x','h'));
		
	}
}
