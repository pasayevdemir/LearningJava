import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] logPass = new String[100][2];
        logPass[0][0] = "tural";
        logPass[0][1] = "tural123";
        logPass[1][0] = "agasi";
        logPass[1][1] = "agasi123";
        logPass[2][0] = "kenan";
        logPass[2][1] = "kenan123";
        String newLog = "", newPass = "", input;
        boolean logBoll,passBoll;
        System.out.println("LogUp/exit/LogIn");
        input = scan.nextLine();
        if (input.equals("LogUp")) {
            System.out.print("UserName: ");
            newLog = scan.nextLine();
            System.out.print("Password: ");
            newPass = scan.nextLine();
            input = "LogIn";
        }
        while(input.equals("LogIn")){
            System.out.print("UserName: ");
            newLog = scan.nextLine();
            System.out.print("Password: ");
            newPass = scan.nextLine();

        }
//        if (input.equals("LogIn") ) {
//
//            for (int i = 0; i>-1; i++) {
//
//                if (logPass[i][0].equals(newLog)) {
//                    if (logPass[i][1].equals(newPass)) {
//                        input="exit";
//                        System.out.println("Daxil oldunuz!!");
//                        i=-100;
//                    } else{
//                        passBoll=true;
//                    }
//                } else {
//                    logBoll=true;
//                }
//                if(i==2)i=0;
//            }
//            if (logBoll == true) {
//                System.out.println("Log yalnis");
//            }
//            if (passBoll == true) {
//                System.out.println("Pass yalnis");
//            }
//        }
        if (input.equals("exit")) {
            System.out.println("Proqramdan Cixildi!!");
        }

    }
}
