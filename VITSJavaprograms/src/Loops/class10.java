package Loops;
import java.util.Scanner;

public class class10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
 
        System.out.println("Hello World from " + name);
 
        scanner.close();
    }
}
 
