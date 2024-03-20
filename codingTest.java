class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        // 제한 사항 : 1 ≤ p의 길이 ≤ 18
        // int는 숫자 10자리, long 사용해야함
        for(int i = 0;i<t.length()-p.length()+1;i++){
            if(Integer.valueOf(p) >= (Integer.valueOf(t.substring(i, i+p.length())))){
                answer++;
            } 
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("500220839878","7"));
    }
}