package lv1;

import javax.swing.text.AbstractDocument.BranchElement;

public class Programmers_40 {

    // 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    // 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을
    // return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Programmers_40 pro = new Programmers_40();
        pro.solution("Hello elephant");
    }

    public String solution(String my_string) {
        String answer = "";
        // answer = my_string.replaceAll("[aeiou]", "");
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == 'a') {
                continue;
            } else if (my_string.charAt(i) == 'e') {
                continue;
            } else if (my_string.charAt(i) == 'i') {
                continue;
            } else if (my_string.charAt(i) == 'o') {
                continue;
            } else if (my_string.charAt(i) == 'u') {
                continue;
            }
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
