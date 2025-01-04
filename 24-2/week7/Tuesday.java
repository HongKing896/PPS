import java.util.Scanner;

class Tuesday{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    StringBuilder sb = new StringBuilder("long int");
    for(int i = 0; i < (N/4)-1; i++){
      sb.insert(0,"long ");
    }
    System.out.println(sb);
  }
}