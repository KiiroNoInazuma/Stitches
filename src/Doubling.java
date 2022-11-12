import java.util.Scanner;

public class Doubling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doubleChar = sc.nextLine();
        System.out.print("1) ");
        // variant #1
        for (int i = 0; i < doubleChar.length(); i++) {

            System.out.print(doubleChar.charAt(i));
            System.out.print(doubleChar.charAt(i));
        }
        //variant #2
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < doubleChar.length(); i++) {
            sb.append(doubleChar.charAt(i));
            sb.append(doubleChar.charAt(i));
        }
        System.out.println("\n2) " + sb);
    }
}
