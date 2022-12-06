public class Programmers_11 {

    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소의 평균값을
    // return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        int[] num = { 1, 4, 5, 6, 7, 8, 9 };
        Programmers_11 pro = new Programmers_11();
        pro.solution(num);
    }

    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return answer / numbers.length;
    }
}
