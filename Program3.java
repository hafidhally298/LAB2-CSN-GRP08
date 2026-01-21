 import java.util.Scanner;
    public class Program3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a string:");
            String string = input.nextLine();
            System.out.println("    RESULTS    ");
            System.out.println("uppercase: " + string.toUpperCase());
            System.out.println("lowercase: " +  string.toLowerCase());
            System.out.println("Number of characters: " + string.length());
            System.out.println("First character: " + string.charAt(0));
            System.out.println("Last character: " + string.charAt(string.length()-1));
            System.out.println("New name: " + string.replaceFirst("", "_"));

            int count = 0;
            String lowerstring = string.toLowerCase();
            for (int i = 0; i < lowerstring.length(); i++) {
                if (lowerstring.toLowerCase().charAt(i) == 'a') {
                    count = count + 1;}
                }
                System.out.println("Number of 'a' characters: " + count);

        }
}




