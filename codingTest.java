import java.util.*;
class Solution {
    public int solution(String s)
    {
        //처음에 스택 쓸 생각을 못하고 리스트나 세트로 풀려고 했었음 스택과 큐의 존재도 알아놔야겠다.
        int answer = -1;
        //stack을 character 타입으로 만들어서 (**Stack(Character>**)문자열의 각 자리의 문자를 스택에 삽입
        Stack<Character> stack = new Stack<>(); 

        for(int i = 0; i<s.length();i++){
            //스택이 비어있지 않고, 제일 꼭대기와 내가 지금 넣으려는 값이 같으면 넣지 않고 원래 있던
            //값 삭제, 그렇지 않고 비어있다면 값 삽입
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.size() == 0){
            answer = 1;
        } else{
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("cdcd"));

    }
}
