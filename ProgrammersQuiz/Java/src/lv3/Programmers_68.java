package lv3;

import java.util.ArrayList;
import java.util.List;

public class Programmers_68 {
    // 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서
    // return 하는 solution 함수를 만들어 주세요.
    // 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    public static void main(String[] args) {
        solution(123);
    }

    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            answer += Character.getNumericValue(str.charAt(i));
        }
        return answer;
    }
}
