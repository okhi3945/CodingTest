class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0; //cnt로 공백시 마다 카운트 초기화
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                if (cnt % 2 == 0) {
                    answer += String.valueOf(s.charAt(i)).toUpperCase();
                    cnt++;
                } else {
                    answer += String.valueOf(s.charAt(i)).toLowerCase(); //홀수일때 소문자로 변환시켜주기
                    cnt++;
                }
            } else {
                answer += " ";
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // solution.solution("try hello world");
        System.out.println(solution.solution("tryaaworl  dabc"));
    }
}