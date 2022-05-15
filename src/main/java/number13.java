import java.util.Calendar;

public class number13 {
    String solution(int a, int b) {
        Calendar c = Calendar.getInstance();
        c.set(2022, a - 1, b);
        String[] answer = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int weekday = c.get(Calendar.DAY_OF_WEEK);
        return answer[weekday-1];
    }

    public static void main(String[] args) {
        number13 n = new number13();
        String solution = n.solution(5, 15);
        System.out.println(solution);
    }
}

//1. Java 클래스 Calendar를 import해준 뒤 Calendar 객체를 생성한다.
//    -Calendar.getInstance()를 통해 import 가능
//2. 달력은 입력 받는 것보다 +1을 하여 들어가기 때문에 입력할 때 a-1를 사용하여 set을 이용해 설정한다.
//3. answer 배열에 요일의 이름으로 초기화한다.
//4. weekday에 Calendar 클래스에 있는 날짜를 받아오는 DAY_OF_WEEK을 사용하여 가져온다.
//5. DAY_OF_WEEK은 1, 2, 3, 4, 5, 6, 7 이런 식으로 가져오기 때문에 answer 배열에 사용했고 -1을 통해 본래의 요일로 맞춰주었다.(위에도 서술했듯 Calendar는 +1하여 들어감)
//6. return을 사용해서 결과값을 반환한다.

