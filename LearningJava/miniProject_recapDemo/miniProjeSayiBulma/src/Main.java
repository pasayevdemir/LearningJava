public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,0};
        int find = 5;
        boolean ok = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == find) {
                ok = true;
            }
        }
        if (ok) {
            System.out.println("Rəqəm mövcutdur!");
        } else {
            System.out.println("Rəqəm mövcut deyil!");
        }
    }
}
