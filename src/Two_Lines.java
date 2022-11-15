import java.util.Arrays;
import java.util.Scanner;

public class Two_Lines {
    public static void main(String[] args) {
        //variant #1
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String repeat = sc.nextLine();
        System.out.println("Введите символ разделителя: ");
        String separator = sc.nextLine();
        System.out.println("Введите количество повторений: ");
        int result = sc.nextInt();
        StringBuilder sb = new StringBuilder(repeat);
        for (int i = 0; i < result - 1; i++) {
            sb.append(separator);
            sb.append(repeat);
        }
        System.out.println(sb);

        //variant #2
        String[] line = new String[result];
        Arrays.fill(line, repeat);
        String ans = String.join(separator, line);
        System.out.println(ans);
    }
}

