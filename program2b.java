 public class program2b {
    public static void main(String[] args) {
        String name = "Computer science";
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(name.length()-1);
        System.out.println("    RESULTS    ");
        System.out.println("firstchar: " + ch1);
        System.out.println("lastchar: " + ch2);
        System.out.println("word is " + name.substring(name.length()-7));
}

}
