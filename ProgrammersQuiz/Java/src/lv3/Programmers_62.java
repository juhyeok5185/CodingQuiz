package lv3;

public class Programmers_62 {
    // 정수 num과 k가 매개변수로 주어질 때,
    // num을 이루는 숫자 중에 k가 있으면 num의
    // 그 숫자가 있는 자리 수를 return하고 없으면
    // -1을 return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        solution(3876398, 6);
    }

    public static int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;
    }
}
