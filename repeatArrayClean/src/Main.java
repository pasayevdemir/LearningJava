import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), say = 0;
        int[] array = new int[n], indexCatch = new int[n];
        //input
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        //Let's solve the problem
        System.out.print(array[0]+" ");
        for (int i = 1; i < n; i++) {
            if (array[i-1] != array[i]) {
                System.out.print(array[i]+" ");
            }
        }
    }
}