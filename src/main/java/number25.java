public class number25 {
    long solution(long n) {
        double a = Math.sqrt(n);
        long answer = (long)a;

        if((answer)*(answer) == n){
            answer = (answer + 1)*(answer + 1);
        } else{
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        number25 n = new number25();
        long solution = n.solution(121);
        System.out.println(solution);
    }
}

// 1. 숫자 n의 제곱근이 정수인지 판별하기 위해 Math 함수의 sqrt를 사용
//    - sqrt를 하게 된다면 실수형으로 저장 되기 때문에 double을 사용해서 a라는 변수를 생성
// 2. 반환하기 위한 answer 변수를 long으로 선언하고 a를 형을 맞추기 위해 (long)을 사용해 형변환을 하고 저장
// 3. sqrt를 사용한 answer * answer이 n 인지 판단 하는 if 문을 사용
//    1) answer * answer == n
//        - n+1의 제곱을 리턴해야하기에 (answer+1)*(answer+1)을 answer에 대입
//    2) answer * answer != n
//        - answer이 n의 제곱근이 아닐 때는 -1을 반환 시켜줘야하기에 answer에 -1을 대입
// 4. return을 사용해 answer을 반환