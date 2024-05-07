import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        ArrayList<String> list = new ArrayList<>();
        //처음 나온 단어는 먼저 리스트에 넣고 생각
        list.add(words[0]);
        int cnt = 1;
        for (int i = 1; i < words.length; i++) {
            cnt++;
            //끝말잇기 단어 리스트에 넣어두고 마지막 글자와 새로 넣으려는 글자의 첫 글자가 같은 지 확인
            if (words[i - 1].endsWith(String.valueOf(words[i].charAt(0)))) {
                System.out.println("같다" + words[i]);

                //중복된 값 발견(contain)시 번호(cnt)와 차례 찾아서 answer에 답 넣고 break
                if (list.contains(words[i])) {
                    System.out.println("중복 : " + words[i]);
                    System.out.println("번호 : " + cnt);
                    if ((i + 1) % n == 0) {
                        System.out.println("차례 : " + (i + 1) / n);
                        answer[0] = cnt;
                        answer[1] = ((i + 1) / n);
                    } else {
                        System.out.println("다르다 : " + (((i + 1) / n) + 1));
                        answer[0] = cnt;
                        answer[1] = (((i + 1) / n) + 1);
                    }
                    break;
                }
                list.add(words[i]);
            } else {
                System.out.println("다르다 번호 : " + cnt);
                if ((i + 1) % n == 0) {
                    System.out.println("차례 : " + (i + 1) / n);
                    answer[0] = cnt;
                    answer[1] = ((i + 1) / n);
                } else {
                    System.out.println("다르다 : " + (((i + 1) / n) + 1));
                    answer[0] = cnt;
                    answer[1] = (((i + 1) / n) + 1);
                }
                break;
            }

            if (cnt >= n) {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] s = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
        System.out.println(solution.solution(3, s));

    }
}
