/**
 * Inputs
 */
import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // System.out.print("Enter your roll number: "); 
        // int rollNo = input.nextInt(); // Read an integer input
        // System.out.println("Your roll number is " + rollNo);
        
        // System.out.println("Your name: ");
        // String name = input.nextLine();
        // System.out.println("Your name is " + name);

        // float num = input.nextFloat();
        // System.out.println("Your number is " + num);

        // System.out.print("Enter the first number: ");
        // int num1 = input.nextInt();
        
        // // Prompt the user for the second number
        // System.out.print("Enter the second number: ");
        // int num2 = input.nextInt();
        
        // int sum = num1 + num2;
        
        // System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        

        // Type casting
        int num = (int)(67.56f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);
        
        input.close();
    }
}