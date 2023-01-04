package lv2;

public class Programmers_53 {
    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는
    // 최댓값을 return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 5, 6, 7, 8 };
        solution(numbers);
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        for (int i : numbers) {
            if (answer < i) {
                answer = i;
            }
        }
        return answer;
    }
}
