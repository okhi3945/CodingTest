class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numS = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        //contain 사용시 zero가 먼저 실행되기 때문에 contain 사용 X
        //contain 대신 replace 사용하기
        for(int i = 0;i<numS.length;i++){
            s=s.replace(numS[i], String.valueOf(i));
        }
        answer = Integer.valueOf(s);
        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("one4zeroeight"));
    }
}