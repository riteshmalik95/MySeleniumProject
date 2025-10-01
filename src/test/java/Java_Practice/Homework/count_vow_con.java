package Homework;

public class count_vow_con {
    public static void main(String[] args) {
        String str = "Ritesh Malik";

        // convert to lowercase for easy comparison
        str = str.toLowerCase();

        int vow = 0; 
        int cons = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check if it's a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow++;
                } else {
                    cons++;
                }
            }
        }

        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + cons);
    }
}
