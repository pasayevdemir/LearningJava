public class Main {

    public static void main(String[] args) {
	    sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] numbers={1,2,3,5,6,5,4};
        boolean varMi=false;
        int find=4;
        for (int i = 0; i < numbers.length; i++) {
            if(find==numbers[i]){
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("Rəqəm tapıldl!");
        }else{
            System.out.println("Rəqəm tapılmadı!");
        }
    }

}
