public class Main {

    public static void main(String[] args) {
        String[] telebeler = new String[4];
        telebeler[0] = "Engin";
        telebeler[1] = "Derin";
        telebeler[2] = "Salih";
        telebeler[3] = "Ahmet";
        for (int i = 0; i < telebeler.length; i++) {
            System.out.println(telebeler[i]);
        }
        for(String telebe:telebeler){
            System.out.println(telebe);
        }
    }
}
