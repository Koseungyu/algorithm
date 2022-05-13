class number3 {
    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 ==0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else{
            answer = s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        number3 n = new number3();
        String abcde = n.solution("abcde");
        System.out.println(abcde);
    }
}