import java.util.Scanner;

class Main {
    public static void main( String[] aregs ){
        Main no2920 = new Main();
        no2920.solve();
    }

    public void solve(){
        Scanner s = new Scanner(System.in);
        String flag = "start";  
        String input = s.nextLine();
        String[] nums = input.split(" ");
        int[] num = new int[nums.length]; 
        for( int i = 0; i < nums.length; i++){
            num[i] = Integer.parseInt(nums[i]);
        }
        
        for( int i = 0; i < num.length-1; i++){
            if(num[i] <= num[i+1] ){
                if(flag.equals("start") || flag.equals("ascending")){
                    flag = "ascending";
                } else {flag = "mixed"; break;}
            } else {
                if(flag.equals("start") || flag.equals("descending")){
                    flag = "descending";
                } else {flag = "mixed"; break;}
            }
        }
        System.out.println(flag);
    }
}