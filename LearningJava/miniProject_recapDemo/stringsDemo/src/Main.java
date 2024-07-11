import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bu gün hava çox gözəldir!";
        /*System.out.println(mesaj);
        System.out.println("Element sayi: " + mesaj.length());
        System.out.println("5-ci element: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("!"));
        char[] simvollar = new char[5];
        mesaj.getChars(0, 5, simvollar, 0);
        System.out.println(simvollar);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('a'));*/

        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,6));

        for (String soz: mesaj.split(" ")) {
            System.out.println(soz);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
