
public class Programmers_17 {

    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string을 거꾸로 뒤집은 문자열을
    // return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Programmers_17 pro = new Programmers_17();
        pro.solution("안녕하세요");
    }

    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
