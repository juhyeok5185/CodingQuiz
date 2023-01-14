import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programmers_57 {
    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는
    // 최댓값을 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        int[] numbers = { 1, 3, -7, 8, -13 };
        solution(numbers);
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arr.add(numbers[i]);
        }

        arr.sort(Comparator.reverseOrder());
        answer = arr.get(0) * arr.get(1);
        if (arr.get(arr.size() - 1) < 0 && arr.get(arr.size() - 2) < 0) {
            int a = (arr.get(arr.size() - 1)) * (arr.get(arr.size() - 2));
            if (a > answer) {
                answer = a;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
