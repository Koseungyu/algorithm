import java.util.Arrays;

public class number23 {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int index = 0;

        int temp = 0;

        while(n>0){
            temp = (int) (n%10);
            n = n/10;
            answer[index] = temp;
            index ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        number23 n = new number23();
        int[] solution = n.solution(12345);
        System.out.println(Arrays.toString(solution));
    }
}
