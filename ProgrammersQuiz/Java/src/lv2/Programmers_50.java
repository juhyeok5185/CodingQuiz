public class Programmers_50 {
    // 정수 배열 array가 매개변수로 주어질 때,
    // 가장 큰 수와 그 수의 인덱스를 담은 배열을
    // return 하도록 solution 함수를 완성해보세요.
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 6, 7, 9 };
        solution(array);
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                index = i;
            }
        }

        answer[0] = maxValue;
        answer[1] = index;

        return answer;
    }
}
