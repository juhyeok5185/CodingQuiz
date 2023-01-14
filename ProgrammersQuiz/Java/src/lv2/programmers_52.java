import java.util.ArrayList;
import java.util.List;

public class programmers_52 {
    // 정수가 담긴 배열 numbers와 문자열
    // direction가 매개변수로 주어집니다.
    // 배열 numbers의 원소를 direction방향으로
    // 한 칸씩 회전시킨 배열을 return하도록
    // solution 함수를 완성해주세요.

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
        solution(arr, "right");
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arr.add(numbers[i]);
        }

        if (direction.equals("right")) {
            arr.add(0, arr.get(arr.size() - 1));
            arr.remove(arr.size() - 1);
        } else if (direction.equals("left")) {
            arr.add(arr.size(), arr.get(0));
            arr.remove(0);
        }

        answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
