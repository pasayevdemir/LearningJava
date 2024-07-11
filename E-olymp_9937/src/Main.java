import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        long n=scan.nextLong(),m=scan.nextLong();
        long nBoyuk,nKicik;
        nBoyuk=pow(10,n);
        nKicik=nBoyuk/10;
        if (m <= nKicik && n!=m) {
            System.out.print(nBoyuk-nKicik);
        }
        else if (m>=nKicik && nBoyuk > m) {
            System.out.print(nBoyuk-m-1);
        }
        else
            System.out.print(0);
    }

    public static long pow(long eded,long quvet) {
        long hasil=1;
        for (int i = 0; i < quvet; i++) {
            hasil*=eded;
        }
        return hasil;
    }
}