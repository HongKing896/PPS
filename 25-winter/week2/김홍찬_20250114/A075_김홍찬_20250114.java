//https://school.programmers.co.kr/learn/courses/30/lessons/42746

import java.util.*;

class Main{
  public static void main(String[] args) {
    Main programmers = new Main();
    //가장 큰 수
    programmers.no42746();
  }
  
  void no42746() {
    int[] numbers = {6,10,2};
    StringBuilder sb = new StringBuilder();
    String[] str = new String[numbers.length];
    for(int i=0; i<numbers.length; i++){
      str[i] = String.valueOf(numbers[i]);
    }
    Arrays.sort(str, new Comparator<String>(){
      @Override
      public int compare(String o1, String o2){
        return (o2+o1).compareTo(o1+o2);
      }
    });
    if(str[0].equals("0")) sb.append("0");
    else{
      for(String s : str){
        sb.append(s);
      }
    }
    System.out.println(sb.toString());
  }
}