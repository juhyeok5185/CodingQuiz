public class Programmers_4 {
    // 정수 num1, num2가 매개변수로 주어질 때,
    // num1를 num2로 나눈 나머지를
    // return 하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        Programmers_4 pro = new Programmers_4();
        pro.solution(3, 4);
    }

    public int solution(int num1, int num2) {
        return num2 % num1;
    }
}
