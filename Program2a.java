public class Program2a {

    public static void main(String[] args) {
        String course = "computer Science";
        char ch1 = course.charAt(0); // get first character
        char ch2 = course.charAt(15); // get last character
        int length = course.length(); // get length of a character
        String word = course.substring(9); // Get word begining from character 9
        System.out.println("    RESULTS    ");
        System.out.println("first char: "+ch1);
        System.out.println("last char: "+ch2);
        System.out.println("length of string: "+length);
        System.out.println("word is "+word);

    }
}
