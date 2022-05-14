public class number4 {
    long solution4(int a, int b) {
        long answer = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        number4 n = new number4();
        long answer = n.solution4(3, 5);
        System.out.println(answer);
    }
}

