public class number22 {
    public int solution(int n) {
        String number = Integer.toString(n);
        int answer = 0;

        for(int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        number22 n = new number22();
        int solution = n.solution(123);
        System.out.println(solution);
    }
}
