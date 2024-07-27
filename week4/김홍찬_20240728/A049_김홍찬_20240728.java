import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.no4659();
    }

    void no4659() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("end")) return;
            if (isEasy(str)) {
                System.out.println("<" + str + "> is acceptable.");
            } else {
                System.out.println("<" + str + "> is not acceptable.");
            }
        }
    }

    boolean isEasy(String str) {
        String vowels = "aeiou";
        boolean hasVowel = false;
        int vc = 0, cc = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
                vc++;
                cc = 0;
            } else {
                cc++;
                vc = 0;
            }

            if (vc >= 3 || cc >= 3) {
                return false;
            }

            if (i > 0 && c == str.charAt(i - 1) && !(c == 'e' || c == 'o')) {
                return false;
            }
        }

        if (!hasVowel) {
            return false;
        }

        return true;
    }
}
