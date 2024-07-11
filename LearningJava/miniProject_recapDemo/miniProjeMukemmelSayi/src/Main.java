public class Main {

    public static void main(String[] args) {
        //6 ---> 1,2,3,6
        //28--->1,2,4,7,14,28
        int number = 10, total = 0;

        for (int i = 1; i < 28; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println("Mükəmməl ədəddir!");
        } else {
            System.out.println("Mükəmməl ədəd deyil!");
        }










        /*boolean isPrime = true;
        if (number==1){
            System.out.println("Nə sadə, nə də mürəkkəbdir!");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sadə ədəddir!");
        } else {
            System.out.println("Mürəkkəb ədəddir!");
        }*/
    }
}
