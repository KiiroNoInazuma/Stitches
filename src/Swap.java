import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lastTwo = sc.nextLine();
        //variant #1
        lastTwo = lastTwo.substring(0, lastTwo.length() - 2) + lastTwo.charAt(lastTwo.length() - 1) + lastTwo.charAt(lastTwo.length() - 2);
        System.out.println(lastTwo);
        //variant #2 (обратное преобразование);
        char[] last = lastTwo.toCharArray();
        char temp = last[last.length - 1];
        last[last.length - 1] = last[last.length - 2];
        last[last.length - 2] = temp;
        String result = new String(last);
        System.out.println(result);

    }
}
