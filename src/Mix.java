import java.util.Scanner;

public class Mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String two = sc.nextLine();
        String result;

        int x = one.length();
        int y = two.length();

        result = (x < y) ? one + two.substring(y - x) : one.substring(x - y) + two;

        System.out.println(result);
    }
}

