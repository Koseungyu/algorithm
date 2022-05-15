public class number12 {
    public long solution(int price, int money, int count) {
        long result = 0;
        long totalPrice = 0;

        // 1. 놀이기구를 타기위한 총 비용을 계산
        for(int i=1; i<=count; i++) {
            totalPrice += price * i;
        }

        // 2. 가진 돈과 비교 하여 return 값 지정
        result = (totalPrice > money) ? totalPrice-money : 0;
        return result;
    }

    public static void main(String[] args) {
        number12 n = new number12();
        long solution = n.solution(3, 50, 4);
        System.out.println(solution);
    }
}

// 1. long타입 result 값과 totalprice 값을 0으로 초기화한다.
// 2. 놀이기구를 타기위한 총 비용을 계산하기 위해 count를 for문으로 반복해주고 반복 횟수마다 price를 곱해주면서 totalprice 값을 계산해준다.
// 3. money 변수와 totalprice 값을 비교해서 result값을 리턴해준다.

