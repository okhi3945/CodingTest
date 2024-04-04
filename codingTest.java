import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        // 제일 작은 숫자와 제일 큰 숫자를 곱해야겠네
        // 효율성 테스트가 빡쌤 아마도 for문을 2번써서 그런 것 같음
        // for (int i = 0; i < A.length; i++) {
        // for (int j = i + 1; j < A.length; j++) {
        // if (A[j] < A[i]) {
        // int tmp = 0;
        // tmp = A[j];
        // A[j] = A[i];
        // A[i] = tmp;
        // }
        // if (B[i] < B[j]) {
        // int tmp = 0;
        // tmp = B[j];
        // B[j] = B[i];
        // B[i] = tmp;
        // }
        // }
        // }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> Blist = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
            Blist.add(B[i]);
        }
        list.sort(Comparator.naturalOrder());
        Blist.sort(Comparator.reverseOrder());

        
        for(int i = 0;i<list.size();i++){
            answer += (list.get(i) * Blist.get(i));
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = { 5, 100, 5, 350, 37, 49 };
        int[] b = { 80, 60, 90, 7, 190, 20 };
        System.out.println(solution.solution(a, b));
    }
}