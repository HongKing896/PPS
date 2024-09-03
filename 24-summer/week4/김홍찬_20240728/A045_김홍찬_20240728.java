
import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no1577();
    }

    void no1577() {
        Scanner s = new Scanner(System.in);
        String l = s.nextLine();
        l = l.toUpperCase();
        if(l.length() < 2) {
            System.out.println(l);
            return;
        }
        HashMap<Character, Integer> ch = new HashMap<>();
        for (char c : l.toCharArray()) {
            if (ch.containsKey(c)) {
                ch.put(c, ch.get(c) + 1);
            } else {
                ch.put(c, 1);
            }
        }
        int max = 0;
        int count = 0;
        char k = '?';
        for (char key : ch.keySet()) {
            if (ch.get(key) > max) {
                max = ch.get(key);
                k = key;
            }
        }
        for (char key : ch.keySet()) {
            if (ch.get(key) == max) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("?"); 
        }else {
            System.out.println(k);
        }
    }
}
