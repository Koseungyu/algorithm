public class number21 {
    String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        int count = 0;
        for(int i=0; i < s.length(); i++){
            if(count % 2 == 0){
                answer += array[i].toUpperCase();
            } else {
                answer += array[i].toLowerCase();
            }
            count++;
            if(array[i].equals(" ")){
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        number21 n = new number21();
        String solution = n.solution("try hello world");
        System.out.println(solution);
    }
}

//1. String 타입으로 반환할 answer을 ""으로 초기화
//2. 문자열 s를 split을 사용하여 나누어서 String 배열 array에 저장
//3. 공백의 위치를 알기 위해 count를 int 타입으로 선언하고 0으로 초기화
//4. s의 길이만큼 for문을 반복
//    1) count가 0이면
//        - answer에 array[i].toUpperCase()를 사용해 문자 하나를 대문자로 바꾸어 answer에 넣어줌
//    2) count가 0이 아니라면
//        - answer에 array[i].toLowerCase()를 사용해 문자 하나를 소문자로 바꾸어 answer에 넣어줌
//5. count를 1씩 증가시켜 짝수번째 문자와 홀수번째 문자를 판별
//6. 만일 array[i]가 빈칸일 경우 equals를 사용하여 count를 0으로 초기화 하여 공백 기준 인덱스로 만들어줌
//7. 위 과정을 끝낸 answer을 return을 사용해 반환
