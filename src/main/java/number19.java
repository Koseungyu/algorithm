public class number19 {
    String solution(int n) {
        String[] waterMelon = {"수", "박"};
        String answer = "";

        for(int i=1; i<=n;i++){
            if(i % 2 == 0){
                answer += waterMelon[1];
            } else{
                answer += waterMelon[0];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        number19 n = new number19();
        String solution = n.solution(5);
        System.out.println(solution);
    }
}
// 1. 문자열 배열 a에 "수"와 "박"을 넣어 초기화한다.
// 2. 문자열 길이가 n이니 for을 사용해 1부터 n번 돌려주고 i가 홀수 이면 "수"를 짝수이면 "박"을 문자열에 추가했다.
// 3. return을 사용해서 결과값을 반환