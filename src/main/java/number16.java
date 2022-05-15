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

