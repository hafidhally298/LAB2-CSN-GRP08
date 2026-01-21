import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = input.nextDouble();
        System.out.println("    RESULTS    ");
        System.out.println("Square root of number: " + Math.sqrt(number));  // Display square root of a number
        System.out.println("Power of a number: " + Math.pow(number, 2));  // Display power of a number
        System.out.println("value of pi: " + Math.PI);
          // Generate random floating point number between 0 and 1
        System.out.println("Random number between 0 and 1: " + Math.random());




    }
}
