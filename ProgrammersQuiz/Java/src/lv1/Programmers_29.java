package lv1;

public class Programmers_29 {

    // 문자열 my_string과 정수 n이 매개변수로 주어질 때,
    // my_string에 들어있는 각 문자를 n만큼 반복한 문자열을
    // return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        Programmers_29 pro = new Programmers_29();
        pro.solution("Hello", 3);
    }

    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char myChar = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                answer += myChar;
            }
        }
        return answer;
    }
}
