public class number17 {
    public boolean solution(String s) {
        boolean answer = true;
        boolean answer2 = false;

        if (s.length() == 4 || s.length() == 6) {
            answer = s.matches("^[0-9]*$");
            return answer;
        }
        if (s.length() == 1 || s.length() == 3) {
            System.out.println("값이 작아서 리턴할 수 없습니다.");
        } else if (s.length() >= 9) {
            System.out.println("값이 커서 리턴할 수 없습니다.");
        }
        return answer2;
    }
    public static void main(String[] args) {
        number17 n = new number17();
        boolean solution = n.solution("124123456789");
        System.out.println("solution = " + solution);
    }
}

//1. boolean 타입으로 반환해줄 answer을 false로 초기화하고 선언
//2. if문으로 s가 4 혹은 6일 때만 answer에 matches("^[0-9]*$")를 사용해서 안에 내용이 숫자로만 구성되어있는지 확인 한 결과를 answer에 저장
//    - 여기서 ^[0-9]*$ 는
//      ^ 으로 우선 패턴의 시작 [0-9] 괄호사이에 두 숫자를 넣어 범위를 지정
//      * 를 넣으면 글자 수를 상관하지 않고 검사
//      $ 으로 패턴의 종료
//3. return을 사용하여 answer을 반환
