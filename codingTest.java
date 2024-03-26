class Solution {
    public String solution(int a, int b) {
        String answer = "";
        //2016년 1월 1일 금요일 -> week 배열 FRI부터 시작
        //윤년 -> 2월 29일까지
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = 0;
        
        //a월까지의 일수 다 더해주기
        for(int i = 0;i<a-1;i++){
            day += month[i];
        }

        //day%7하면 각 월의 1일 요일이 나오고
        //+ b%7로 일수에 따른 요일 계산
        //day%7 + b%7 값이 7이 넘어가는 것을 방지하도록 한번 더 %7해서 요일만 알아내고
        //배열을 "FRI"부터 시작하였기 때문에 1월 1일의 경우 1이 나오는데, 자기자신을 빼고, 
        //배열의 0번째 값인 FRI를 가져오기 위해 - 1을 해준다.
        int p = (day%7 + b%7)%7 - 1;
        if(p < 0){
            p += 7;
        }

        System.out.println(p);
        answer = week[p];
        
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution( 1, 1));
    }
}