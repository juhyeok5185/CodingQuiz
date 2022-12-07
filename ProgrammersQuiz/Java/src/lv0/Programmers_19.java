
public class Programmers_19 {

    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 각 원소에 두배한 원소를 가진
    // 배열을 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 8, 9 };
        Programmers_19 pro = new Programmers_19();
        pro.solution(arr);
    }

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
