public class Programmers_3 {
    // 머쓱이는 40살인 선생님이 몇 년도에 태어났는지
    // 궁금해졌습니다. 나이 age가 주어질 때,
    // 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        Programmers_3 pro = new Programmers_3();
        pro.solution(20);
    }

    public int solution(int age) {
        int answer = 2022 - (age - 1);
        return answer;
    }
}
