class Solution {
    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        // 피보나치 수열은 첫째 항과 둘째 항이 1이고,
        // 그 이후의 항은 바로 앞의 두 항을 더한 수로 이루어진 수열임 ex) 0,1,1,2,3,5,8,,,
        for (int i = 2; i <= n; i++) {
            // n의 범위가 100,000이기 때문에 오버플로우 발생
            // ex) n이 47일 때의 피보나치 수 : 2,971,215,073 -> 32bit 정수(int)의 범위 넘음
            // 100,000번째 피본치 수는 자릿수가 20,000을 넘어가고, 64bit 정수(long)의 범위 넘음
            //그렇기 때문에 오버플로우가 일어나지 않게 1234567을 나눈 나머지 값으로 계산
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(100000));

    }
}
