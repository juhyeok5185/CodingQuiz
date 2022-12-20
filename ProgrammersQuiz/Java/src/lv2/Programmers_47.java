import java.util.ArrayList;

public class Programmers_47 {
    // // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    // numlist에서 n의 배수가 아닌 수들을 제거한 배열을
    // return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        int[] numlist = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        solution(3, numlist);
    }

    public static int[] solution(int n, int[] numlist) {
        int cnt = 0;
        int plus = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[plus] = numlist[i];
                plus++;
            }
        }
        return answer;
    }
}
