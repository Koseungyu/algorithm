public class number18 {
    String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+ "에 있다";
                break;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        number18 n = new number18();
        String solution = n.solution(new String[]{"Kim", "jane"});
        System.out.println("solution = " + solution);
    }
}

//1. String으로 반환을 해야 되기에 객체 answer을 String으로 선언
//2. seoul의 길이만큼 for문을 돌려줌(배열은 인덱스 0부터 시작하니 주의)
//3. equals 메서드를 사용해서 seoul 배열에 Kim의 위치를 찾음
//4. answer에 김서방이 몇 번째에 있는지 문자열을 저장
//    - + 를 사용해서 문장 "김서방은"과 i와 "에 있다"를 이어서 answer에 저장
//5. return을 사용해 answer을 반환
