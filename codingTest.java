class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int a = 1;   
        for(int i =1;i<n+1;i++){ //두 값과 모두 나누어 떨어지는 값 찾기(최대 공약수)
            if(n%i == 0 && m%i == 0){
                a = i;
            }
        }
        answer[0] = a;
        answer[1] = n/a*m;

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(6,16);
    }
}