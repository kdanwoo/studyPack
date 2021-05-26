package stream;

import java.util.ArrayList;

public class StreamTest2 {
    public static void main(String[] args) {
        ArrayList<Card> cardList = new ArrayList<Card>();

        cardList.add(new Card("123","KIM",10000));
        cardList.add(new Card("234","LEE",20000));
        cardList.add(new Card("456","SHIM",30000));

        cardList.stream() // Stream 인스턴스 생성
                .filter(s->s.getTotalSpent() >= 20000) //중간 작업 totalSpent가 20000이상만
                .forEach(s-> System.out.println(s.getCardId())); //종료 cardId 출력
    }
}
