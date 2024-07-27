
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no10773();
    }

    void no10773() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Stack<Integer> zero = new Stack<>();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            if (a == 0) {
                zero.pop(); 
            }else {
                zero.push(a);
            }
        }
        int sum = 0;
        while (!zero.isEmpty()) {
            sum += zero.pop();
        }
        System.out.println(sum);
        s.close();
    }
}
