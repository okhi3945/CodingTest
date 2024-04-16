class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int plus = 0;

        // 1부터 number까지 약수의 개수 구하기
        for (int j = 1; j <= number; j++) {

            // 약수의 개수 값을 담을 cnt값
            int cnt = 0;

            // 약수의 개수를 계산할 for문
            for (int i = 1; i * i <= j; i++) {

                //제곱근이면 한쌍의 약수 밖에 나올 수 없기 때문에 cnt에 1더하기
                if (i * i == j) {
                    cnt++;
                } else if (j % i == 0) { 
                    //제곱근이 아니면 이 값은 항상 쌍을 이루기 때문에 그 쌍까지 더해서 +2 해주기
                    cnt += 2;
                }
            }

            // 약수의 갯수가 제한 수치 limit값 보다 크면 무기의 공격력은 power로 제한된다.
            if(cnt > limit){
                plus = power;
            }else { //제한 수치를 넘지 않으면 약수의 개수는 그대로 공격력이 되어 무게가 된다.
                plus = cnt;
            }
            //answer에 무게를 더해주며 반복한다.
            answer+=plus;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, 3, 2));

    }
}
