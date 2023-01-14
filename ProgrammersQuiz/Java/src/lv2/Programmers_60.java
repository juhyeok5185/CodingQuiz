public class Programmers_60 {
    // 문자열 my_string과 정수 num1, num2가
    // 매개변수로 주어질 때, my_string에서
    // 인덱스 num1과 인덱스 num2에 해당하는 문자를
    // 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        solution("aabbccdd", 0, 2);
    }

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] s = my_string.split("");
        for (int i = 0; i < s.length; i++) {
            if (i == num1) {
                answer += s[num2];
            } else if (i == num2) {
                answer += s[num1];
            } else {
                answer += s[i];
            }
        }
        return answer;
    }
}
