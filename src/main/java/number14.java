import java.util.*;

public class number14 {
    int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        for(int i = 0; i <arr.length; i++){
            if(arr[i]%divisor == 0){
                a1.add(arr[i]);
            }
        }
        if(a1.isEmpty()){
            a1.add(-1);
        }
        answer = new int[a1.size()];
        for(int i = 0; i<a1.size() ; i++){
            answer[i] = a1.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        number14 n = new number14();
        int[] solution = n.solution(new int[]{3,2,9},4);
        System.out.println(Arrays.toString(solution));
    }
}

// 1. int[] 타입으로 반환할 answer 변수를 초기화하여 선언했다.
// 2. ArrayList인 a1을 Integer 타입으로 선언했다,
// 3. for 문을 사용하여 arr 배열에 있는 원소를 divisor로 나누었을 때 나머지가 0인 원소만 add를 사용하여 a1에 추가했다
// 4. a1이 비어있을 경우 a1에 add를 이용하여 -1을 추가했다.
// 5. answer의 크기를 a1의 size 만큼으로 설정했다.
// 6. for문을 사용하여 a1에 있는 원소를 get으로 꺼내서 answer에 저장했다
// 7. answer을 Arrays.sort를 이용해 정렬했다.
// 8. return을 사용하여 answer을 반환했다.