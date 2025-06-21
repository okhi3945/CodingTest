package Baekjoon;
// 단어공부

// https://www.acmicpc.net/problem/1157

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int[] alpha = new int[27];
        String a = sc.nextLine().toLowerCase();
        int max = 0;
        int maxIndex = 0;

        for(int i = 0;i<a.length();i++){
            alpha[a.charAt(i) - 96]++;
        }

        for(int i = 0; i< alpha.length;i++){
            if(alpha[i] > max){
                max = alpha[i];
                maxIndex = i;
            } 
            else if(alpha[i] == max){
                maxIndex = 0;
            }
        }
        if(maxIndex == 0){
            System.out.println("?");
        } else{
            System.out.println(Character.toString((char)'a' + (maxIndex-1)).toUpperCase());
        }
        
    }
}
