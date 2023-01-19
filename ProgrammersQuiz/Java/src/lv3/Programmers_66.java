import java.util.ArrayList;
import java.util.List;

public class Programmers_66 {
    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string에서 중복된 문자를 제거하고
    // 하나의 문자만 남긴 문자열을 return하도록
    // solution 함수를 완성해주세요.

    public static void main(String[] args) {
        solution("hello world");
    }

    public static String solution(String my_string) {
        String answer = "";
        
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < my_string.length(); j++) {
                if(arr.get(i) == )
            }
        }

        return answer;
    }
}
