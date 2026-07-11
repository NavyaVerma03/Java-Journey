// Frequency of each character
package String;
public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "program";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 1;

            // Agar character pehle aa chuka hai to skip karo
            boolean visited = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    visited = true;
                    break;
                }
            }

            if (visited) {
                continue;
            }

            // Current character ki frequency count karo
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}