//24/09/19

//백준
//https://www.acmicpc.net/problem/10699
//Level: 브론즈 5 - very Easy


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Thursday{
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fmNow = now.format(fm);
        System.out.print(fmNow);
    }
}