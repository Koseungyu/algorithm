public class number16 {
    boolean solution(String s) {
        boolean answer = true;
        int sum_p = 0;
        int sum_y = 0;
        String[] s1 = s.split("");
        for(int i = 0; i<s.length(); i++){
            if(s1[i].equals("P") || s1[i].equals("p")){
                sum_p += 1;
                continue;
            }
            if(s1[i].equals("Y") || s1[i].equals("y")){
                sum_y += 1;
                continue;
            }
        }
        if(sum_p == sum_y){
            answer = true;
        } else{
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        number16 n = new number16();
        boolean solution = n.solution("pPyYsavcasdf");
        System.out.println("solution = " + solution);
    }
}

// 1. true나 false를 반환할 수 있는 변수 answer을 boolean으로 선언
// 2. P나 p의 개수를 담을 변수 sum_p와 Y나 y의 개수를 담을 변수 sum_y를 int로 선언
//    - 연산을 위해서는 초기값을 선언해줘야 하기에 0으로 선언
// 3. 문자열 s를 split을 사용하여 하나씩 잘라 문자열 배열 s1에 저장
// 4. for문을 사용하여 s1의 각 원소가 P인지 Y인지 판단할 수 있게 if문을 사용하여 sum_p와 sum_y을 계산
//    - 문자 값을 판별할 때는 s1[i] == "P"을 사용하는 것이 아니라 s1[i].equals("P") 이런 식으로 사용
//    - equals()는 메소드, 객체끼리 내용을 비교할 수 있음. 대상의 내용 자체를 비교
//    - ==는 비교를 위한 연산자, 대상의 주소값을 비교
//    - equals의 반대는 ex. !s1.equals("a") 이런식으로 사용
// 5. sum_p와 sum_y 값이 같다면 true를 다르다면 false를 변수 answer에 저장
// 6. return을 사용하여 변수 answer을 반환
