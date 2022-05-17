public class number9 {
    String solution(String phone_number) {
        String answer = "";
        //.split을 사용해서 phone_number를 하나하나씩 잘라서 a라는 문자배열에 저장.
        String[] a = phone_number.split("");
        for(int i= 0; i<a.length; i++){
            if(i < (a.length-4)) {
                answer += "*";
            } else {
                answer += a[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        number9 n = new number9();
        String solution = n.solution("01012341234");
        System.out.println("번호 = " + solution);
    }
}

//1. 핸드폰 번호 앞자리를 가리기 위해 answer 변수의 타입을 String으로 해줌.
//2. split을 사용하여 phone_number을 하나씩 잘라서 a라는 문자열 배열에 저장
//3. 총 answer의 길이가 a.length와 동일하기에 for문을 사용
//    1) i < a.length-4 일 때
//        - 맨 뒷 자리 4자리수만 빼고 가리면 되기에 "*"을 answer에 추가
//    2) i < a.length-4 가 아닐 때
//        - 맨 뒷 자리 4자리 수는 가리면 안 되기에 a[i]에 해당하는 수를 answer에 추가
//4. answer를 return을 사용하여 반환