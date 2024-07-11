import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,m,say=0;
        boolean a=false;
        n=scan.nextInt();

        int[] oneArray=new int[n],keep=new int[n];
        for (int i=0;i<n;i++){
            oneArray[i]=scan.nextInt();
        }
        m=scan.nextInt();
        int[] twoArray=new int[m];
        for (int i=0;i<m;i++){
            twoArray[i]=scan.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(oneArray[i]==twoArray[j]){
                    a=true;
                }
            }
            if (a==false){
                keep[say]=oneArray[i];
                say++;
            }a=false;
        }
        System.out.println(say);
        for (int i=0;i<say;i++){
            System.out.print(keep[i]+" ");
        }

    }
}
