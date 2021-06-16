import java.time.*;

public class Time_Eg 
{
	public static void main(String[]args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.isLeapYear());
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime now = LocalDateTime.now();  
        System.out.println(now);  
}
}
