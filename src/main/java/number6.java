public class number6 {
    public int solution(int[] numbers) {
        //0~9의 합을 answer 변수에 넣어준다.
        int answer = 0+1+2+3+4+5+6+7+8+9;

        //numbers 배열을 반복문으로 돌려서 빼준다.
//        for(int i=0; i<numbers.length;i++){
        for (int i : numbers) {
            answer -= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        number6 n = new number6();
        int solution = n.solution(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(solution);

    }
}
