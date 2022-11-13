public class First_and_Last {
    public static void main(String[] args) {
        String a = " ";
        String b = "chars";
        if (a.isBlank()) {
            a = "@";
        }
        if (b.isBlank()) {
            b = "@";
        }
        String result = a + b;
        System.out.println(result.charAt(0) + "" + result.charAt(b.length() - 1));
    }
}
