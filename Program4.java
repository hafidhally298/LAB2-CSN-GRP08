import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          System.out.println("Enter a first string: ");
          String firststring = scanner.nextLine();

          System.out.println("Enter a second string: ");
          String secondstring = scanner.nextLine();
        // comparison between two srings
        if(firststring.equals(secondstring)){
            System.out.println("The strings are the same.");}
        else{
            System.out.println("The strings are not the same.");
        }
        // Display lengths of the strings
        System.out.println("Length of the first string is: " + firststring.length());
        System.out.println("Length of the second string is: " + secondstring.length());
    }
}
