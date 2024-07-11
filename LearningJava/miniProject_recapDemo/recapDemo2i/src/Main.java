public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 7.3, 4.3, 5.6};
        double total = 0, max = myList[0];
        for (double list : myList) {
            if (max < list) max = list;
            total += list;
            System.out.println(list);
        }
        System.out.println(max + " " + total);
    }
}
