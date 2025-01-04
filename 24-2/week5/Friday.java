
import java.util.Scanner;

public class Friday{
    public static void main(String[] args){
        Friday bj17478 = new Friday();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int c = 0;
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        bj17478.answer(N,c);
    }
    
    void answer(int N, int c){
        for(int i = 0; i < c; i++) System.out.print("____");
        System.out.println("\"재귀함수가 뭔가요?\"");
        if(N == 0){
            for(int i = 0; i < c; i++) System.out.print("____");
            System.out.println("재귀함수는 자기 자신을 호출하는 함수라네");
        } else {
            for(int i = 0; i < c; i++) System.out.print("____");
            System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            for(int i = 0; i < c; i++) System.out.print("____");;
            System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            for(int i = 0; i < c; i++) System.out.print("____");
            System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            answer(N-1,c+1);
        }
        for(int i = 0; i < c; i++) System.out.print("____");
        System.out.println("라고 답변하였지.");
    }
    // public class Main{
//     public static void main(String[] args){
//         Main bj17478 = new Main();
//         Scanner s = new Scanner(System.in);
//         int N = s.nextInt();
//         System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//         bj17478.answer(N, 0);
//     }
    
//     void answer(int N, int c){
//         // 첫 번째 호출에서는 indent가 없도록 처리
//         String indent = (c > 0) ? "____".repeat(c) : "";
        
//         System.out.println(indent + "\"재귀함수가 뭔가요?\"");
        
//         if(N == 0){
//             System.out.println(indent + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
//         } else {
//             System.out.println(indent + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
//             System.out.println(indent + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
//             System.out.println(indent + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
//             answer(N-1, c+1);
//         }
        
//         System.out.println(indent + "라고 답변하였지.");
//     }
}

