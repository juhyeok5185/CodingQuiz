package lv2;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

public class Programmers_45 {

    // 문자열 my_string이 매개변수로 주어질 때,
    // my_string 안에 있는 숫자만 골라 오름차순
    // 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

    public static void main(String[] args) {
        Programmers_45 pro = new Programmers_45();
        pro.solution("juhyeok5185");
    }

    public int[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char characterData = my_string.charAt(i);

            if (Character.isDigit(characterData)) {
                String stringData = String.valueOf(characterData);
                list.add(stringData);
            }
        }

        return list.stream().sorted().mapToInt(Integer::parseInt).toArray();
    }
}
