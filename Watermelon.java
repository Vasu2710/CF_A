import java.util.Scanner;
public class Watermelon{

    public static void helper(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2==0 && n!=2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args){
       helper();
    }

}