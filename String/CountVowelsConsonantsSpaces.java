package String;

public class CountVowelsConsonantsSpaces {

        public static void main(String[] args) {

            String str = "Java Programming";

            int vowels = 0;
            int consonants = 0;
            int spaces = 0;

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                    vowels++;

                } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                    consonants++;

                } else if (ch == ' ') {

                    spaces++;
                }
            }

            System.out.println("Vowels = " + vowels);
            System.out.println("Consonants = " + consonants);
            System.out.println("Spaces = " + spaces);
        }

}
