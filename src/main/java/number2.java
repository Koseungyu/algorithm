class number2 {
    public String solution(int num) {
//            if(num % 2 == 0){
//                return ("Even");
//            }else{
//                return ("Odd");
//            }
        //        2차풀이
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        number2 n = new number2();
        String solution = n.solution(30);
        System.out.println(solution);

    }
}