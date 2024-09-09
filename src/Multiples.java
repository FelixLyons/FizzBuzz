public class Multiples {
    public static void main(String[] args) {
        System.out.println(multi3And5(1000));
    }

    public static int multi3And5(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        return count;
    }
}
