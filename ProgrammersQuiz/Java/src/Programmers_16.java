public class Programmers_16 {
    // 정수가 담긴 리스트 num_list가 주어질 때,
    // num_list의 원소 중 짝수와 홀수의 개수를
    // 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Programmers_16 pro = new Programmers_16();
        pro.solution(arr);
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }
        return answer;
    }
}
