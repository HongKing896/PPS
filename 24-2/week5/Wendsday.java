import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Wendsday{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    int connectionCount = Integer.parseInt(br.readLine());

    // int[][] connection = new int[connectionCount][2];
    // for(int i = 0; i < connectionCount; i++){
    //   st = new StringTokenizer(br.readLine());
    //   connection[i][0] = Integer.parseInt(st.nextToken());
    //   connection[i][1] = Integer.parseInt(st.nextToken());
    // }

    //bfs
    //1.큐에 1을 넣는다.
    //2.connection[i][0]이 큐의 첫번째 값이면 connection[i][1]에 있는 수를 큐에 넣는다. 카운트를 늘린다.
    //3.큐에서 첫번째값을 제거한다.
    //4.큐가 빌 때까지 2,3을 반복한다.
  //   Queue<Integer> q = new LinkedList<Integer>();
  //   q.offer(1);
  //   int count = 0;
  //   while(!q.isEmpty()){
  //     for(int i = 0; i < connectionCount; i++){
  //       if(connection[i][0] == q.peek()) {
  //         q.offer(connection[i][1]);
  //         count ++;
  //         }
  //     }
  //     q.poll();
  //   }
  //   System.out.println(count);
  // }
  //-> 틀림, 서로 연결된 상황을 고려하지 못해서 그것도 셈

    //0.감염된 노드가 들어갈 배열을 선언
    //1.큐에 1을 넣는다.
    //2.connection[i][0]이 큐의 첫번째 값이면 connection[i][1]에 있는 수를 큐에 넣는다.
    //2-2.그 수가 감염된 배열에 없으면 그 수를 감염된 노드 배열에 추가한다.
    //3.큐에서 첫번째값을 제거한다.
    //4.큐가 빌 때까지 2,3을 반복한다.
    //5.감염된 배열에 크기를 출력한다.
  //   String infected = "1";
  //   Queue<Integer> q = new LinkedList<Integer>();
  //   q.offer(1);
  //   while(!q.isEmpty()){
  //     for(int i = 0; i < connectionCount; i++){
  //       if(connection[i][0] == q.peek()) {
  //         q.offer(connection[i][1]);
  //         if(!infected.contains(String.valueOf(connection[i][1]))){
  //             infected = infected + String.valueOf(connection[i][1]);
  //           }
  //         }
  //     }
  //     q.poll();
  //   }
  //   System.out.println(infected.length()-1);
  // }
  // 메모리 초과

  //   Set<Integer> infected = new HashSet<>();
  //   Queue<Integer> q = new LinkedList<Integer>();
  //   q.offer(1);
  //   while(!q.isEmpty()){
  //     for(int i = 0; i < connectionCount; i++){
  //       if(connection[i][0] == q.peek()) {
  //         q.offer(connection[i][1]);
  //         if(!infected.contains(connection[i][1])){
  //             infected.add(connection[i][1]);
  //           }
  //         }
  //     }
  //     q.poll();
  //   }
  //   System.out.println(infected.size()-1);
  // }
  //여전히 메모리 초과

    List<List<Integer>> graph = new ArrayList<>();
    for(int i = 0; i < N; i++){
      graph.add(new ArrayList<>());
    }

    for(int i = 0; i < connectionCount; i++){
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken());
      int to = Integer.parseInt(st.nextToken());
      graph.get(from-1).add(to-1);
      // graph.get(to-1).add(from-1); //양방향 연결
    }

    Set<Integer> infected = new HashSet<>();
    Queue<Integer> q = new LinkedList<Integer>();
    q.offer(0);
    infected.add(0);
    while(!q.isEmpty()){
      for(int nextNode : graph.get(q.peek())){
        if(!infected.contains(nextNode)){
          q.offer(nextNode);
          infected.add(nextNode);
        }
      }
      q.poll();
    }

    System.out.println(infected.size()-1);
  }
}