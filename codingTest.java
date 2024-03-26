class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[][] a = new char[n][];
        char[][] b = new char[n][];
        for (int i = 0; i < n; i++) {
            //Integer 클래스의 toBinaryString() 메서드를 사용하여 정수를 이진수(문자열)로 변환
            //변환된 이진수의 길이를 n으로 만들기 위해서 앞에 부족한 만큼 0 추가해주기(repeat() 함수 사용)
            //toCharArray() 사용하여 char 배열에 값 넣어주기
            if (Integer.toBinaryString(arr1[i]).length() < n) {
                a[i] = ("0".repeat(n - Integer.toBinaryString(arr1[i]).length()) + Integer.toBinaryString(arr1[i]))
                        .toCharArray();
            } else {
                a[i] = Integer.toBinaryString(arr1[i]).toCharArray();
            }
            if (Integer.toBinaryString(arr2[i]).length() < n) {
                b[i] = ("0".repeat(n - Integer.toBinaryString(arr2[i]).length()) + Integer.toBinaryString(arr2[i]))
                        .toCharArray();
            } else {
                b[i] = Integer.toBinaryString(arr2[i]).toCharArray();
            }
        }

        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                //a[i][j] - '0'을 해주어서 a의 각 배열의 값을 문자에서 정수로 변환
                //두 정수의 값을 합한 값이 1이 넘어가면 #으로 표시
                if((a[i][j] - '0') + (b[i][j] - '0') >= 1){
                    temp += "#";
                }else{
                    temp += " ";
                }
            }
            answer[i] = temp;
        }
        for(int i = 0;i<answer.length;i++){
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = { 46, 33, 33 ,22, 31, 50 };
        int[] b = { 27 ,56, 19, 14, 14, 10 };
        System.out.println(solution.solution(6, a, b));
    }
}