import java.util.Scanner;

public class How_many {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите исходный текст: ");
        String text = sc.nextLine();
        System.out.print("Введите текст для поиска: ");
        String countHi = sc.nextLine();
        countHi = countHi.toUpperCase();
        text = text.toUpperCase();
        int check = 0;

        for (int x = 0; x <= text.length() - countHi.length(); x++) {
            if (countHi.equals(text.substring(x, x + countHi.length()))) {
                check++;
            }
        }

        System.out.println("Текст встречается " + check + " раз(а).");
    }
}

