import java.util.Scanner;

public class Undercut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maxBlock = sc.nextLine();

        char[] charArr = maxBlock.toCharArray();
        char current = charArr[0];
        int check = 1;
        int max = 1;
        int index = 1;

        for (int i = 1; i < charArr.length; i++) {

            if (current == charArr[i]) {
                check++;
                continue;
            }
            current = charArr[i];
            if (max < check) {
                max = check;
                index = i;
            }
            check = 1;
        }
        System.out.println("Буква " + charArr[index - 1] + " повторяется " + max + " раз(а)");
    }
}


