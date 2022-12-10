package lv1;

import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner14;

public class Programmers_37 {
    // 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원
    // 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
    // 구매한 옷의 가격 price가 주어질 때, 지불해야 할
    // 금액을 return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        Programmers_37 pro = new Programmers_37();
        pro.solution(150000);
    }

    public int solution(int price) {
        float answer = price;
        if (price >= 100000 && price < 300000) {
            answer *= 0.95f;
        } else if (price >= 300000 && price < 500000) {
            answer *= 0.9f;
        } else if (price >= 500000) {
            answer *= 0.80f;
        }
        return (int) answer;
    }
}
