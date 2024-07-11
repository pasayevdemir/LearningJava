public class Main {

    public static void main(String[] args) {
        char harf = 'e';
        /*char[] qalin = {'a', 'A', 'ı', 'I', 'o', 'O', 'u', 'U'};
        char[] ince = {'e', 'E', 'i', 'İ', 'ö', 'Ö', 'ü', 'Ü'};
        for (int i = 0; i < 8; i++) {
            if (harf == qalin[i]) {
                System.out.println("Harf Kalındır!");
                break;
            }
            if (harf == ince[i]) {
                System.out.println("Harf İncedir!");
                break;
            }
        }*/


        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın seseli harf");
                break;
            default:
                System.out.println("İnce seseli harf");
        }
    }
}
