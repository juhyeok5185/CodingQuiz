public class Programmers_6 {

    // 정수 num1과 num2가 매개변수로 주어집니다.
    // 두 수가 같으면 1 다르면 -1을 retrun하도록
    // solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Programmers_6 pro = new Programmers_6();
        pro.solution(4, 3);
    }

    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        // num1 이 num2랑 같은면 1 다르면 -1
        return answer;
    }
}
