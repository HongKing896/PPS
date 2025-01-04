//24/09/13

//백준
//https://www.acmicpc.net/problem/15649


//모범답안
import java.util.Scanner;

public class friday {
    private static int N, M;          // N: 숫자의 범위, M: 선택할 숫자의 개수
    private static boolean[] visited; // 선택된 숫자를 기록하는 배열
    private static int[] result;      // 선택된 숫자를 저장하는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 숫자의 최대 값
        M = sc.nextInt(); // 선택할 숫자의 개수
        
        visited = new boolean[N + 1]; // 1부터 N까지의 숫자를 위한 배열 (0은 사용하지 않음)
        result = new int[M];         // M개의 숫자를 저장할 배열
        
        backtrack(0); // 백트래킹 시작
    }

    private static void backtrack(int depth) {
        if (depth == M) { // M개의 숫자를 모두 선택한 경우
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " "); // 선택된 숫자를 출력
            }
            System.out.println(); // 줄바꿈
            return;
        }

        for (int i = 1; i <= N; i++) { // 1부터 N까지의 숫자를 시도
            if (!visited[i]) { // 숫자 i가 아직 선택되지 않은 경우
                visited[i] = true; // 숫자 i를 선택
                result[depth] = i; // 현재 선택된 숫자를 결과 배열에 저장
                backtrack(depth + 1); // 다음 깊이로 재귀 호출
                visited[i] = false; // 백트래킹: 숫자 i 선택 취소
            }
        }
    }
}