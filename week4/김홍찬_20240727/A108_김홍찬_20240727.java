
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no3062();
    }

    void no3062() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            String str = String.valueOf(b);
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(b));
            sb.reverse();

            str = String.valueOf(Integer.parseInt(sb.toString()) + b);

            if (isPalindrome(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        s.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
