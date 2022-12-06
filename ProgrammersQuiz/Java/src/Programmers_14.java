public class Programmers_14 {

    // 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
    // array에 n이 몇 개 있는 지를
    // return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 3, 5, 6, 6, 7, 8, 9, 2, 3 };
        Programmers_14 pro = new Programmers_14();
        pro.solution(arr, 3);
    }

    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        return answer;
    }
}
