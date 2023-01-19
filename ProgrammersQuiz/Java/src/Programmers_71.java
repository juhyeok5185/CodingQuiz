import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_71 {
    // 자연수 n을 뒤집어 각 자리 숫자를
    // 원소로 가지는 배열 형태로 리턴해주세요.
    // 예를들어 n이 12345이면 [5,4,3,2,1]을
    // 리턴합니다.

    public static void main(String[] args) {
        solution(12345);
    }

    public static int[] solution(long n) {
        int[] answer = {};
        String a = String.valueOf(n);
        for (int i = 1; i < a.length() + 1; i++) {
            a.charAt(a.length() - 1);
        }
        return answer;
    }
}
