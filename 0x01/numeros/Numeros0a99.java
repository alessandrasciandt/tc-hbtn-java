public class Numeros0a99 {

    static final int numerMax = 99;
    public static void main(String args[]) {
        for (int i = 0; i <= numerMax; i++) {
            System.out.printf("%d%c ",i, i==numerMax ? 00: 44);
        }
    }
}
