import java.util.Scanner;

public class Repeatedly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "Hello";
        int result = sc.nextInt();
        try {
            for (int x = 0; x < result; x++) {
                word = word.substring(word.length() - result);
                System.out.print(word);
            }
        } catch (StringIndexOutOfBoundsException ind) {
            System.out.println("Нельзя ввести число больше " + word.length());
            main(args);
        }
    }
}



