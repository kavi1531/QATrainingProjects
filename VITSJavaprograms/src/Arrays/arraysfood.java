package Arrays;
import java.util.Scanner;

public class arraysfood {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] food= {"Falafel","Biryani","Dosa Idli Combo","Pasta","Tacos","Fried rice"};
		System.out.println("Please enter the number of your food choice to view the dishes we have");
		System.out.println("1.Middle Eastern"
				+ " 2.North Indian"
				+ " 3.South Indian"
				+ " 4.Italian"
				+ " 5.Mexican"
				+ " 6.Chinese");
		int x = input.nextInt();
		System.out.println("Your choice is "+x+". Today, we have "+ (food[x-1]));
		
		
		

	}

}
