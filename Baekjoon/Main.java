package Baekjoon;
// 숫자의 합
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        sc.nextLine(); // 버퍼 지워주기

        String arr = sc.nextLine(); // sc.next() 사용시 버퍼를 지워주지 않아도 됨
        for(int i = 0;i<n;i++){
           answer += Integer.parseInt(String.valueOf(arr.charAt(i))); // arr.charAt(i) - '0'; 문자를 숫자로 변환하는 더 간단한 방법
        }
        System.out.println(answer);
    }
}