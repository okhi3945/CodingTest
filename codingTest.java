class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) { //정렬
                System.out.println(strings[i].substring(n,n+1).compareTo(strings[j].substring(n,n+1)));
                if (strings[i].substring(n,n+1).compareTo(strings[j].substring(n,n+1)) > 0) { //i의 값이 j값보다 사전적으로 뒤에 있을 시 j를 앞으로 i를 뒤로
                    String temp = " ";
                    temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                } else if (strings[i].substring(n,n+1).compareTo(strings[j].substring(n,n+1)) == 0) { //각 자리 문자가 같을 경우는 compareTo()를 통해서 i의 값이 j의 값보다 사전적으로 뒤에 있을 시 서로 위치 바꿔준다.
                    System.out.println(strings[i].compareTo(strings[j]));
                    if (strings[i].compareTo(strings[j]) > 0) { //i의 값이 j값보다 사전적으로 뒤에 있을 시 j를 앞으로 i를 뒤로
                        String temp = " ";
                        temp = strings[j];
                        strings[j] = strings[i];
                        strings[i] = temp;
                        System.out.println(strings[i] + "strings[i]" + i);
                        System.out.println(strings[j] + "strings[j]" + j);
                    }
                } 
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        answer = strings;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = { "zbcde", "ybcdf", "xbcdg" };
        System.out.println(solution.solution(a, 1));
    }
}