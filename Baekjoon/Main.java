package Baekjoon;
// 복호화
import java.util.Scanner;

public class Main {

    public String calculate(String s){
        int[] cnt = new int[27];
        String answer = "";
        String conversionString = "abcdefghijklmnopqrstuvwxyz";

        int max = 0;
        int maxIndex = 0;
        for(int i = 0;i<s.length();i++){
            cnt[s.charAt(i) - 'a'] += 1; // 오답노트) 'a' - 'a' = 0, 'b' - 'a' = 1, '0'이 아니라 'a'도 빼거나 더할 수 있다!
        }
        // for(int i =0; i<cnt.length;i++){
        //     System.out.println(cnt[i]);
        // }
        boolean isEqual = false;
        for(int i =0;i<cnt.length;i++){
            if(cnt[i] > max){
                max = cnt[i];
                maxIndex = i;
                isEqual = false;
            } else if(cnt[i] == max){
                isEqual = true;
            }
        }
        // System.out.println(isEqual);
        if(isEqual){
            answer="?";
        } else{
            answer = String.valueOf(conversionString.charAt(maxIndex));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int a = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i<a;i++){
            String s = sc.nextLine();
            System.out.println(main.calculate(s.replaceAll(" ", "")));
        }

    }
}

// package Baekjoon;
// // 복호화
// import java.util.Scanner;

// public class Main {
    
//     public String calculate(String s){
//         int[] cnt = new int[26];
        
//         for(char c : s.toCharArray()){
//             cnt[c-'a']++;
//             // System.out.println("c : " + (c-'a')); ex) 'a' - 'a' = 0, 'b' - 'a' = 1
//         }

//         int maxCount = 0;
//         int max = 0;
//         for(int i = 0;i<cnt.length;i++){
//             if(cnt[i] > max){
//                 max = cnt[i];
//                 maxCount = 1;
//             } else if(cnt[i] == max){
//                 maxCount++;
//             }
//         }

//         if(maxCount > 1) return "?";
        
//         for(int i = 0; i < cnt.length;i++){
//             if(max == cnt[i]){
//                 return String.valueOf((char)('a' + i)); // 'a' + 0 = 'a', 'a' + 1 = 'b'
//             } 
//         }

//         return "?";
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Main main = new Main();
//         int i = sc.nextInt();
//         sc.nextLine();

//         for(int j = 0; j<i;j++){
//             String s = sc.nextLine().replaceAll(" ", "");
//             System.out.println(main.calculate(s));
//         }
//     }
// }