package lv1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Programmers_28 {
    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는
    // 최댓값을 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        int[] num = { 0, 31, 24, 10, 1, 9 };
        Programmers_28 pro = new Programmers_28();
        pro.solution(num);
    }

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
