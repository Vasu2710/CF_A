import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        while(t-->0){
            String s = sc.nextLine();
            if(s.charAt(1) == '+')
                cnt++;
            else
                cnt--;
        }
        System.out.println(cnt);
    }
}
