package Conditionalstatements;

public class nestedifelsestat {

	public static void main(String[] args) {
		int a=52;
		if(a%2==0)
		{
			if(a<100)
			{
				System.out.println("A is even and under 100");
			}
			else
			{
				System.out.println("A is more than 100");
			}
		}
		else
		{
			System.out.println("A is odd number");
		}
		

	}

}
