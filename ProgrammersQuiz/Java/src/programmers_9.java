public class programmers_9 {
    // 정수 num1과 num2가 매개변수로 주어질 때,
    // num1을 num2로 나눈 값에 1,000을 곱한 후
    // 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

    public static void main(String[] args) {
        programmers_9 pro = new programmers_9();
        pro.solution(3, 2);
    }

    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2;
        answer = answer * 1000;
        return (int) answer;

    }
}
