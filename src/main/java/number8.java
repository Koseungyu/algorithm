public class number8 {
    double solution(int[] arr) {
        // 배열 arr의 합과 평균을 구할 변수 sum, average를 생성 및 초기화
        double sum = 0;
        double average = 0;
        //배열을 for문으로 돌려서 하나하나 더해줌.
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        //합한 값을 배열의 길이 만큼 나눠서 평균을 구함.
        average = sum /arr.length;
        return average;
    }

    public static void main(String[] args) {
        number8 n = new number8();
        double solution = n.solution(new int[]{1, 2, 3});
        System.out.println(solution);
    }
}


