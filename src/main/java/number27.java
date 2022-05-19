public class number27 {
    public int solution(int num) {
        int answer = 0;
        int a = num;

        while(a != 1 && answer != 500){
            if(a % 2 == 0){
                a = a/2;
            } else if(a %2==1){
                a = (a*3) + 1;
            }
            answer++;
        }
        if(answer == 500) {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        number27 n = new number27();
        int solution = n.solution(20);
        System.out.println(solution);

    }
}

//1. int 타입으로 반환할 answer을 0으로 초기화하고 선언
//2. int 타입인 a 변수에 num을 대입하여 선언
//3. a가 1이 아니면서 answer가 500이 되기 전까지 while문을 반복(한번 반복할 때마다 answer을 1씩 증가)
//    - a % 2 가 0이면 a / 2를 a에 대입
//    - a % 2 가 1이면 (a * 3) + 1을 a에 대입
//4. 만약 answer가 500일 경우 answer에 -1을 넣음
//5. return을 사용하여 answer을 반환
