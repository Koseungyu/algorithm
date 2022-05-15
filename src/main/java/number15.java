public class number15 {
    int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        number15 n = new number15();
        int solution = n.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
        System.out.println("a와 b의 내적은 = " + solution + "입니다.");
    }
}

//1. int 타입으로 반환할 변수 answer를 0으로 초기화한다.
//2. int타입 a 배열을 for문을 통해 a 배열 끝까지 하니씩 반복시켜주고 answer에 a,b배열을 서로 곱해준다.
//3. answer를 반환해준다.

