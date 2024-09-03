
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Member implements Comparable<Member> {

    int age;
    String name;
    int order;

    Member(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }

    @Override
    public int compareTo(Member other) {
        if (this.age == other.age) {
            return this.order - other.order;
        } else {
            return this.age - other.age;
        }
    }
}

class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no10814();
    }

    void no10814() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Member[] m = new Member[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            m[i] = new Member(age, name, i);
        }
        Arrays.sort(m);

        for (Member mm : m) {
            sb.append(mm.age).append(" ").append(mm.name).append("\n");
        }
        System.out.print(sb);
    }
}
