
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            // 인덱스 만큼 돌면서 skip에 c가 포함(contains( ))되면 index를 안올리고
            // skip에 포함되지 않으면 index값 + 해서 주어진 index까지 반복  
            for(int j = 0;j<index;j++){
                c++;
                if(c>'z'){
                    c-=26;
                }
                //for문을 돌리지말고 String의 contains( ) 함수를 사용해서 index를 관리해야함
                if(skip.contains(String.valueOf(c))){
                    System.out.println("포함 : " + String.valueOf(c));
                    j--;
                }
            }
            answer+=c;
        }


        return answer;
    }

    public static void main(String[] args) {
        // skip에 값이 연속된 값이거나 반복되는 값인 경우를 생각
        Solution solution = new Solution();
        String a = "klmnopqrstuvwxyz";
        String s = "abcdefghij";
        int index = 20;
        System.out.println(solution.solution(a, s, index));

    }
}