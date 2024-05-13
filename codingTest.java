class Solution {
    public long solution(int n) {

        //한번 가는데 1칸 또는 2칸을 뛸 수 있음
        //그렇다면 n번째까지 점프해서 가는 경우의 수는 n-1번째 칸에서 1칸 뛴 값
        //과 n-2번째 칸에서 2칸 뛰어서 오는 값의 합 밖에 존재하지 않음
        //동적 계획법의 점화식을 사용함
        //dp[n] = dp[n-1] + dp[n]
        //n번째 칸의 값을 구하려면 n-1, n-2번째 칸의 값을 더하면 된다는 것을 알고 점화식을 사용할 줄 알아야함
        int[] dp = new int[2001];
        dp[1] = 1; //1번째 칸에 가는 경우의 수 1개(1칸)
        dp[2] = 2; //2번째 칸에 갈 수 있는 경우의 수는 2개(1칸+1칸, 2칸)
        //dp[n]을 구해야함 -> n번째 칸으로 가는 방법의 개수
        for(int i = 3;i<=n;i++){
            dp[i] = ((dp[i-1] + dp[i-2]) % 1234567);
        }
        
        return dp[n];
        
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(4));

    }
}
