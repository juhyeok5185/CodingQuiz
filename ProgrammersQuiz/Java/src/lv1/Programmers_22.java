package lv1;

public class Programmers_22 {

    // 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    // my_string에서 letter를 제거한 문자열을
    // return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Programmers_22 pro = new Programmers_22();
        pro.solution("dd", "ffggddffgg");
    }

    public String solution(String my_string, String letter) {
        String answer = "";
        char c = letter.charAt(0);
        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (temp == c)
                continue;
            answer += temp;

        }

        return answer;

        // answer = my_string.replace(letter, "");
        // return answer;
    }
}
