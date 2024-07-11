public class Main {

    public static void main(String[] args) {
        char not = 'C';
        switch (not) {
            case 'A':
                System.out.println("En yaxsi sekilde kecdin!");
                break;
            case 'B':
            case 'C':
                System.out.println("Yaxsi sekilde kecdiniz!");
                break;
            case 'D':
                System.out.println("Pis deyil! kecdiniz!");
                break;
            case 'F':
                System.out.println("Kesildiniz!");
                break;
            default:
                System.out.println("Duzgun olmayan qiymet daxil etdiniz!");
        }
    }
}
