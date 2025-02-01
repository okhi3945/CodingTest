package Baekjoon;
// 세로읽기

// https://www.acmicpc.net/problem/10798

import java.util.*;

public class Main {

    // AABCDD
    // afzz
    // 09121
    // a8EWg6
    // P5h3kx

    // Aa0aPAf985Bz1EhCz2W3D1gkD6x

    // a 1
    // bd 2
    // cef 3
    // gfcd 4
    // h 1

    // abdcefgfcdh => abcghdeffcd

    // int[] stringSize = new int[5];
    // ArrayList<Character> list = new ArrayList<>();

    ArrayList<Queue<Character>> list = new ArrayList<>();

    public void save(String s) {
        Queue<Character> queue = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }

        list.add(queue);
    }

    public String readVertical() {
        // list에 있는 큐에 있는 값 맨 위의 값을 빼오고 다음 리스트에 있는 큐 맨위 값 가져오고,
        // 반복
        String answer = "";
        while (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                // System.out.println(list.get(i).poll());
                if (!list.get(i).isEmpty()) {
                    answer += String.valueOf(list.get(i).poll());
                    // System.out.println(i + " 삽입");
                } else{
                    list.remove(i);
                    // System.out.println(i + " 삭제");
                    i--;
                }
                
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            main.save(s);
        }
        System.out.println(main.readVertical());
        // main.readVertical();
    }
}
