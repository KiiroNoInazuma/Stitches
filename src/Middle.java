public class Middle {
    public static void main(String[] args) {
        String middle = "[<<>>]";
        String makeOutWord = "Yay";
        // Variant #1
        StringBuilder sb = new StringBuilder(middle);
        sb.insert(middle.length()/2, makeOutWord);
        System.out.println(sb);
        // Variant #2
        String result = middle.substring(0,(middle.length()/2))+makeOutWord+middle.substring(middle.length()/2);
        System.out.println(result);
    }
}
