import java.util.Arrays;

public class number20 {
    String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0; i < completion.length ; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }

    public static void main(String[] args) {
        number20 n = new number20();
        String s = n.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"});
        System.out.println(s);
    }
}

//1. participant와 completion 배열의 정렬을 위해 java.util.*을 import를 사용해 호출
//2. Arrays.sort를 이용하여 배열을 오름차순으로 정렬한다.
//3. for문을 사용하여 completion의 길이만큼 돌려 정렬된 participant와 completion이 다를 경우 완주하지 못한 선수의 이름인 participant[i]를 return을 사용해 반환한다.
//4. return을 사용해 participant[i]를 반환