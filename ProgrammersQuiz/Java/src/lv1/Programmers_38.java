package lv1;

public class Programmers_38 {

    // 문자열 str1, str2가 매개변수로 주어집니다.
    // str1 안에 str2가 있다면 1을 없다면 2를
    // return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Programmers_38 pro = new Programmers_38();
        pro.solution("qqqqppp", "pppkkkk");
    }

    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
