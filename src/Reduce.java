public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int start = 100;
        int cur = start;
        while(cur != 0){
            if(cur % 2 == 0){
                cur /= 2;
                steps++;
            }
            else{
                cur -= 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
