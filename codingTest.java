class Solution {
    public int solution(int n) {
        int answer = 1; //자기 자신 미리 더하고 시작

        // 연속되는 수 더해서 n이 되려면 n/2가 마지노선임
        for(int i = 1;i<=n/2;i++){
            int sum = 0;
            int k = i;

            //sum이 n보다 작은 동안 while문 돌림
            while(sum<n){
                sum+=k;
                k++;
            }
            //while문을 마친 sum의 값이 n과 같으면 answer+=1
            if(sum==n){
                answer+=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(15));

    }
}
