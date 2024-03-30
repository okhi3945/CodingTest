import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        // aaabbaccccabba
        // a -> aa -> aaa -> aaabb -> aaabba -> aaabbac -> aaabbacc
        // c -> cc -> cca -> ccab
        // b -> ba
        ArrayList<String> list = new ArrayList<>(); //분리된 문자열을 저장해둘 리스트
        String a = "";
        // cor = x와 같은 글자가 나온 횟수
        // incor = x가 아닌 다른 글자들이 나온 횟수
        int cor = 0, incor = 0;
        for (int i = 0; i < s.length(); i++) {
            a += String.valueOf(s.charAt(i));
            System.out.println(a);
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(0) == a.charAt(j)) {
                    cor++;
                    System.out.println("cor " + cor + " " + a);
                } else {
                    incor++;
                    System.out.println("incor " + incor + " " + a);
                }
                if (incor == cor) {
                    System.out.println(incor + " " + cor + " " + i + " " + a);
                    System.out.println(a + " incor == cor");
                    list.add(a);
                    a = "";
                }
            }
            cor = 0;
            incor = 0;
        }
        System.out.println("a : " + a);
        if (!a.isEmpty()) {
            list.add(a);
        }
        for (String hi : list) {
            System.out.println(hi);
        }
        answer = list.size();

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("aaabbaccccabba"));
    }
}