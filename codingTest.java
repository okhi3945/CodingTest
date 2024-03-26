import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        int[] answer = new int[N];
        int[] user = new int[N];
        int[] cntStage = new int[N];
        double[] d = new double[N];
        int cntA = 0;
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 0; j < stages.length; j++) {
                //스테이지의 값보다 i가 더 크면 i번째 스테이지는 깬 것이기 때문에 분모 + 1
                if (stages[j] >= i) {
                    cnt++;
                }
                //현재 스테이지 처리
                if (i == stages[j]) {
                    user[i - 1]++;
                }
            }
            cntStage[i - 1] = cnt;
        }
        for (int i = 0; i < user.length; i++) {
            //스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
            //라는 제한사항을 만족시키기 위해서 분모가 0일 때 실패율을 0으로 설정해준다.
            if(cntStage[i] == 0){
                d[i] = 0; 
            }else{
                //실패율 계산
                d[i] = Double.valueOf(user[i]) / Double.valueOf(cntStage[i]);
            }
        }

        // 실수 값이 제일 큰 순서대로 i+1(스테이지 번호)을 answer에 넣기
        HashMap<Integer, Double> hashMap = new HashMap<>();
        for (int i = 0; i < d.length; i++) {
            hashMap.put(i + 1, d[i]);
        }

        //정렬하기 위해서 hashMap의 entrySet() 메서드를 통해 map.enrty의 리스트를 생성함
        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(hashMap.entrySet());
        
        //Comparator 인터페이스의 compare()메서드를 오버라이딩해서 사용
        //Double 타입인 Value값을 기준으로 정렬하기 위해서 double로 값을 받고, 내림차순으로 
        //Double 클래스의 compare()함수를 사용한다.
        entryList.sort(new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                double s1Score = o1.getValue();
                double s2Score = o2.getValue();
                return Double.compare(s2Score, s1Score);
                //s1Score가 s2Score보다 크면 양수를, 같으면 0을, 작으면 음수를 반환 -> 내림차순
            }
        });
        
        //cntA를 사용해서 answer 배열에 key 값들 넣기 : key값 -> 스테이지 번호
        for (Map.Entry<Integer, Double> entry : entryList) {
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
            answer[cntA] = entry.getKey();
            cntA++;
        }

        for(int i =0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = { 4,4,4,4,4,4 };
        System.out.println(solution.solution(5, a));
    }
}