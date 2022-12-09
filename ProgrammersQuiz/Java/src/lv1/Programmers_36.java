package lv1;

import java.util.Arrays;

public class Programmers_36 {
    // 중앙값은 어떤 주어진 값들을 크기의 순서대로
    // 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    // 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
    // 정수 배열 array가 매개변수로 주어질 때,
    // 중앙값을 return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
        Programmers_36 pro = new Programmers_36();
        pro.solution(array);
    }

    public int solution(int[] array) {
        int al = array.length / 2;
        Arrays.sort(array);
        return array[al];
    }
}
