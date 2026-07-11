package String;

public class PrintWordsNewLine {
    public static void main(String[] args) {

        String str = "Java is easy to learn";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                System.out.println();
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}