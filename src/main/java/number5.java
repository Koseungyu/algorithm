public class number5 {
    int solution(String s) {

        // 문자열을 숫자로 변환하는 메소드는 Integer.parseInt()!
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        number5 n = new number5();
        int solution = n.solution("777");
        System.out.println(solution);
    }
}


// 문자열을 숫자로 변환하는 메소드는 Integer.ParseInt()!
// 숫자를 문자열로 변환하는 메소드는 Integer.toString()!