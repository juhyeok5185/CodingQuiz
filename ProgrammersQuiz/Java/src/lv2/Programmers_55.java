public class Programmers_55 {
    // 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
    // 정수 n이 매개변수로 주어질 때,
    // n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        solution(144);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 0; i < (((n / 2) / 2) / 2); i++) {
            if (i * i == n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        return answer;
    }

}
