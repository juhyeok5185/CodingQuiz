package lv1;

import java.util.ArrayList;

public class Programmers_32 {

    // 수 n이 매개변수로 주어질 때,
    // n 이하의 홀수가 오름차순으로 담긴
    // 배열을 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Programmers_32 pro = new Programmers_32();
        pro.solution(32);
    }

    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // 홀수를 담을 list

        for (int i = 1; i <= n; i += 2) { // 1부터 매개변수n까지 2씩 더하면서
            list.add(i); // list에 추가
        }

        return list;
    }
}
