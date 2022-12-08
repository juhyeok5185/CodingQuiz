package lv1;

public class Programmers_30 {

    // 정수 n이 매개변수로 주어질 때
    // n의 각 자리 숫자의 합을 return하도록
    // solution 함수를 완성해주세요

    public static void main(String[] args) {
        Programmers_30 pro = new Programmers_30();
        pro.solution(1234);
    }

    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n); // int n을 String으로 변환

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i + 1));
        }
        return answer;
    }

}
