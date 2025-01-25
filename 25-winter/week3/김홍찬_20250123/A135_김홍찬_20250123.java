
import java.util.Scanner;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no10773();
    }

    void no10773() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        TreeMap<String, Integer> books = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String a = s.nextLine();
            if (books.containsKey(a)) {
                books.put(a, books.get(a) + 1);
            } else {
                books.put(a, 1);
            }
        }
        int max = 0;
        for (String book : books.keySet()) {
            if (books.get(book) > max) {
                max = books.get(book);
            }
        }
        for (String book : books.keySet()) {
            if (books.get(book) == max) {
                System.out.println(book);
                break;
            }
        }

        s.close();
    }
}
