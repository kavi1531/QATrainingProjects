package javaprograms;
import java.util.*;

public class Timeoftheday {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 24 ");
		int time=input.nextInt();
		if(time <= 24 || time>=1)
		{
			if(time<=12 || time<=6)
			{
				System.out.println("Morning");
			}
			else if(time<=17 || time<=13)
			{
				System.out.println("Afternoon");
			}
			else if(time<=20 || time<=18)
			{
				System.out.println("evening");
			}
			else if(  time<=24 || time<=21)
			{
				System.out.println("night");
			}
		}
		else
		{
			
				System.out.println("Wrong input");
			
		}
	}

}
