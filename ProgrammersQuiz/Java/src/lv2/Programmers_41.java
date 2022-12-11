package lv2;

import java.lang.Integer;

public class Programmers_41 {

    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string안의 모든 자연수들의 합을
    // return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Programmers_41 pro = new Programmers_41();
        pro.solution("1n2u3l4l");
    }

    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == '0') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '1') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '2') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '3') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '4') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '5') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '6') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '7') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '8') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
            if (my_string.charAt(i) == '9') {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
        }
        // for(int i = 0; i < my_string.length(); i++){
        // if(Character.isDigit(my_string.charAt(i))){
        // answer += (int)my_string.charAt(i) - '0';
        // }
        // }
        return answer;
    }
}
