class Solution{
    public long solution(int a, int b) {
        long answer = 0;

        if(a == b){
            return a;
        } else if(a > b){
            for(int i = b;i<=a;i++){
                answer += i;
            }
            System.out.println(answer);
        } else if(a < b){
            for(int i = a;i<=b;i++){
                answer += i;
            }
            System.out.println(answer);
        }
        return answer;
    }

    public static void main(String[] args) {


        Solution sol = new Solution();
        sol.solution(3, 5);
    }
}