import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong(), a = scan.nextLong(), b = scan.nextLong();
        long boyuk = pow(10, n), kicik = boyuk / 10;
        if(kicik<a ){
            if(boyuk>b && a<b){
                System.out.print(b-a);
            }
            else if (boyuk <= b && boyuk>a) {
                System.out.print(boyuk-a);
            }
            else
            {
                System.out.print(0);
            }
        }
        else if(kicik>=a ){
            if(boyuk>=b && kicik<b){
                System.out.print(b-kicik+1);
            }
            else if (boyuk <= b) {
                System.out.print(boyuk-kicik);
            }
            else
            {
                System.out.print(0);
            }
        }
    }

    public static long pow(long eded, long quvet) {
        long hasil = 1;
        for (int i = 0; i < quvet; i++) {
            hasil *= eded;
        }
        return hasil;
    }
}