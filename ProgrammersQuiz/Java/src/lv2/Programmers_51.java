public class Programmers_51 {
    // 정수 n이 매개변수로 주어질 때,
    // n의 약수를 오름차순으로 담은 배열을
    // return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        solution(20);
    }

    public static int[] solution(int n) {
        int[] answer = {};
        int min = 0;
        int max = 0;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        answer = new int[cnt];
        answer[0] = 1;
        answer[1] = n;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer[i] = n / i;
            }
            System.out.println(answer[i]);
        }
        return answer;
    }
}
