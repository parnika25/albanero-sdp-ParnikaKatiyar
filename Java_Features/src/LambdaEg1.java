interface Calculation
{  
    int cal(int a,int b);  
}  
  
public class LambdaEg1
{  
    public static void main(String[] args) 
    {   
    	Calculation c1=(a,b)->(a+b);  
        System.out.println(c1.cal(10,20));  
            
        Calculation c2=(int a,int b)->
        {  
           return (a-b);   
        };  
        System.out.println(c2.cal(500,200));  
        
        Calculation c3=(int a, int b)->
        {
        	return(a*b);
        };
        System.out.println(c3.cal(27,2));
    }  
} 