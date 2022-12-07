public class Programmers_2 {
    // 정수 num1과 num2가 주어질 때,
    // num1에서 num2를 뺀 값을
    // return하도록 soltuion 함수를 완성해주세요.
    public static void main(String[] args) {
        Programmers_2 pro = new Programmers_2();
        pro.solution(5, 4);
    }

    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}
