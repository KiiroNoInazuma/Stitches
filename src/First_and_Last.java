import java.util.Scanner;

public class First_and_Last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.isBlank()) {
            a = "@";
        }
        if (b.isBlank()) {
            b = "@";
        }
        String result = a + b;
        System.out.println(result.charAt(0) + "" + result.charAt(result.length() - 1));
    }
}
