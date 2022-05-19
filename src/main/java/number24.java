import java.util.Arrays;

public class number24 {
    public long solution(long n) {
        char[] input = Long.toString(n).toCharArray();
        Arrays.sort(input);
        long ans = 0;
        for(int i = input.length -1; i>= 0 ; i--){
            ans += input[i] -'0';
            ans *= 10;
        }
        return ans/10;
    }

    public static void main(String[] args) {
        number24 n = new number24();
        long solution = n.solution(118372);
        System.out.println(solution);
    }
}
