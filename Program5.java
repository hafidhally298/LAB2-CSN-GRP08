import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

           System.out.println("Enter student name:");
           String name = input.nextLine();

           System.out.println("Enter student registration number:");
           String registration = input.nextLine();

           System.out.println("Enter student marks");
           String marks = input.nextLine();
         // output of a program
        System.out.println("    output using concatenation    ");
        System.out.println("Name: " + name + "," +" Registration: " + registration + "," + " Marks: " + marks);
        System.out.println("    output using system.out.printf()    ");
        System.out.printf("Name: %s, Registration: %s, Marks: %.2f%n", name, registration, marks);
    }
}
