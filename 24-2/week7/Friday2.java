import java.util.*;

class Friday2{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt(); // 지구 주기
        int S = sc.nextInt(); // 태양 주기
        int M = sc.nextInt(); // 달 주기

        int e = 1, s = 1, m = 1; // 초기 연도는 1 1 1
        int year = 1;

        while (true) {
            // e, s, m이 각각 주어진 E, S, M과 모두 일치할 때 종료
            if (e == E && s == S && m == M) {
                break;
            }
            
            // 한 해가 지나면 e, s, m 모두 1씩 증가
            e++;
            s++;
            m++;
            
            // 범위를 넘으면 다시 1로 돌아감
            if (e > 15) e = 1;
            if (s > 28) s = 1;
            if (m > 19) m = 1;
            
            // 한 해가 지나감
            year++;
        }

        // 결과 출력
        System.out.println(year);
    }
}