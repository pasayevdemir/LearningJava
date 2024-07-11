public class Main {

    public static void main(String[] args) {
        add();
        total(5, 7);
        seheriYaz("Baki");
        System.out.println(total(1,2));
        System.out.println(total2(1, 2, 3, 4));

    }

    public static int total(int num1, int num2) {
        return num1 + num2;
    }

    public static int total2(int... sayilar) {
        int cem = 0;
        for (int i = 0; i < sayilar.length; i++) {
            cem += sayilar[i];
        }
        return cem;
    }

    public static String seheriYaz(String seher) {
        return seher;
    }

    public static void add() {
        System.out.println("Əlavə etdi!");
    }

    public static void delete() {
        System.out.println("Silindi!");
    }

    public static void update() {
        System.out.println("Dəyşildii etdi!");
    }
}
