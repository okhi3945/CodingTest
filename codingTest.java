class Solution {
    public int solution(int n) {
        // Integer.bitCount 함수를 통해 n을 이진수로 만들었을 때 1의 개수를 b에 저장한다.
        int b = Integer.bitCount(n);

        while(true){
            // 무한 루프를 돌며 n의 값을 증가시키기
            n++;
            
            // n의 값을 증가시키다가 증가된 n의 이진수 표현 1의 개수가 b와 같을 때 반환
            if(b == Integer.bitCount(n)){
                return n;
            }
        }
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(78));

    }
}
