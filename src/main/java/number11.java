import java.util.Arrays;

public class number11 {
    long[] solution(int x, int n) {
        long[] answer =  new long[n];
        long a = x;
        for(int i = 1; i <= n; i++){
            answer[i-1] = a * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        number11 n = new number11();
        long[] solution = n.solution(2, 5);
        System.out.println(Arrays.toString(solution));
    }
}

// 1. 반환할 answer 변수를 long[] 타입, 크기 n으로 선언
// 2. long 타입 a 변수에 x를 넣어 선언
//    - long 타입 연산을 해서 answer에 넣어야하기 때문
// 3. answer[i-1] = a * i라는 공식을 for 문을 i가 n일 때까지 반복
//    - a * i 는 길이만큼 떨어져 있는 값이 됨
// 4. return을 사용해 answer을 반환
