package java8F;

import java.time.LocalDate;
import java.time .LocalDateTime;
import java.time.LocalTime;

public class TimeDate {

	public static void main(String args[])
	{
		LocalTime time = LocalTime.now();
		LocalDateTime date = LocalDateTime.now();
		
		System.out.println("Current Time:" +time);
		System.out.println("Current Time:" +date);
		
	}
}
