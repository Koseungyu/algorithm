public class number28 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int x1 = x;
        while(x1>0){
            sum += x1%10;
            x1 = x1/10;
        }
        if(x%sum != 0){
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        number28 n = new number28();
        boolean solution = n.solution(20);
        System.out.println(solution);
    }
}

// 1. boolean 으로 반환할 수 있는 객체 answer 변수를 true로 초기화하여 선언
// 2. 자릿수의 합을 저장할 sum 변수를 0으로 초기화하여 선언
// 3. 변화하는 값 x1 변수를 x로 초기화하여 선언
// 4. x1이 0 이 될 때까지 while문을 돌림
// 5. x1의 값을 10으로 나누어 나머지를 sum에 더해주고 x1의 값을 10으로 나누어 주는 과정을 반복
// 6. x가 각 자릿수의 합으로 나누어 지지 않으면 answer에 false을 대입
// 7. return을 사용하여 answer을 반환