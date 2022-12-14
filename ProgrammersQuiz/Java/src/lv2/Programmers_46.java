package lv2;

import java.util.ArrayList;
import java.util.List;

public class Programmers_46 {

    // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    // numlist에서 n의 배수가 아닌 수들을 제거한
    // 배열을 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        int[] numlist = { 1, 3, 5, 6, 7, 8 };
        Programmers_46 pro = new Programmers_46();
        pro.solution(3, numlist);
    }

    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n != 0) {
                continue;
            }
            answer.add(numlist[i]);
        }
        int[] result = answer.stream().toArray(result[10]);
        return result;
    }
}
