package lv1;

public class Programmers_35 {

    // 어떤 자연수를 제곱했을 때 나오는 정수를
    // 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때,
    // n이 제곱수라면 1을 아니라면 2를
    // return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Programmers_35 pro = new Programmers_35();
        pro.solution(64);
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}
