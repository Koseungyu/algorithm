import java.util.Arrays;

public class number26 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int target = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[target]) {
                target = i;
            }
        }

        int count = 0;
        answer = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (i == target) continue;
            answer[count++] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        number26 n = new number26();
        int[] solution = n.solution(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(solution));
    }
}

// 1. int[] 타입으로 반환할 answer 변수를 선언
// 2. arr의 길이가 1이면 answer에 -1을 넣어서 return
//    - 하나를 삭제하면 빈 배열이기 때문에
// 3. int 타입으로 target을 0으로 초기화하고 선언
// 4. for문을 반복하여 arr[i]가 arr[targer]보다 작으면 target에 i를 대입
//    - 가장 작은 인덱스를 찾는 구문
// 5. int타입의 count를 0으로 초기화하고 선언
// 6. answer은 arr에서 최소값을 뺀 배열이기에 arr.length-1의 크기로 선언
// 7. i가 target과 같은 경우를 제외하고는 answer 배열에 arr 값을 삽입하는 for문을 반복
// 8. return을 사용하여 answer을 반환