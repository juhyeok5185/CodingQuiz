package lv1;

import java.util.Arrays;

public class Programmers_21 {

    // 정수 배열 numbers와 정수 num1,
    // num2가 매개변수로 주어질 때, numbers의
    // num1번 째 인덱스부터 num2번째 인덱스까지
    // 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 7, 8, 10, 13 };
        Programmers_21 pro = new Programmers_21();
        pro.solution(arr, 1, 5);
    }

    public int[] solution(int[] numbers, int num1, int num2) {

        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }

        return answer;
    }
}
