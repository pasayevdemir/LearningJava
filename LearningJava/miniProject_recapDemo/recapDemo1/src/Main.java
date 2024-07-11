public class Main {

    public static void main(String[] args) {
        int say1 = 20, say2 = 30, say3 = 27;
        int enBoyuk=say1;
        if(enBoyuk<=say2)enBoyuk=say2;
        if (enBoyuk<=say3)enBoyuk=say3;
        System.out.println(enBoyuk);



        /*
        if (say1 >= say2) {
            if (say2 >= say3) {
                System.out.print(say1 + " " + say2 + " " + say3);
            } else if (say3 >= say1) {
                System.out.println(say3 + " " + say1 + " " + say2);
            } else if (say3 > say2) {
                System.out.println(say1 + " " + say3 + " " + say2);
            } else {
                System.out.println("say1>say2");
            }

        }
        else if (say2 > say1) {
            if (say1 >= say3) {
                System.out.println(say2 + " " + say1 + " " + say3);
            } else if (say3 >= say2) {
                System.out.println(say3 + " " + say2 + " " + say1);
            } else if (say3 > say1) {
                System.out.println(say2 + " " + say3 + " " + say1);
            } else {
                System.out.println("say2>say1");
            }
        }*/

    }
}
