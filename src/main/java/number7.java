public class number7 {
    int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        number7 n = new number7();
        int solution = n.solution(new int[]{1, 2, 3}, new boolean[]{true, false, true});
        System.out.println(solution);
    }
}
