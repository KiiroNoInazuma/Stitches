public class Repeatedly {
    public static void main(String[] args) {
        String str = "123";
        String str1 = "1234";
        try {
            int result = str1.charAt(10);
        } catch (RuntimeException e) {
            System.out.println("error");
        }


    }
}
