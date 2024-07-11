public class MathPow {
    private long quvvet, eded,sum=1;
    public long setPow(long a, long b) {
        this.eded = a;
        this.quvvet = b;
        for (int i = 0; i < quvvet; i++) {
            sum*=eded;
        }
        return sum;
    }
}
