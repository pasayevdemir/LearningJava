import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k= scan.nextInt(),n=1 ;
        for (int i = 1; i <= k; i++) {
            n*=i;
        }
        System.out.print(n);

    }
}
