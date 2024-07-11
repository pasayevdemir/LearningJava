public class Main {

    public static void main(String[] args) {
        // 220-284
        int num1 = 220, num2 = 284, total1 = 0, total2 = 0;
        for (int i = 1; i < Math.max(num1, num2); i++) {
            if (num1 % i == 0 & i < num1) {
                total1 += i;
            }
            if (num2 % i == 0 & i < num2) {
                total2 += i;
            }
        }
        if (num1 == total2 && num2 == total1) {
            System.out.println("Dost rəqəmələrdi!");
        } else {
            System.out.println("Dost rəqəmlər deyil!");
        }
    }
}
