package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest4 {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();

        cards.add(new Card("1","lee",3023022));
        cards.add(new Card("1","kim",12213124));
        cards.add(new Card("3","choi",5652200));
        cards.add(new Card("3","park",445500));
        cards.add(new Card("2","teawoo",1300));
        cards.add(new Card("2","gun",190053));
        cards.add(new Card("4","bull",444903));

        //그룹으로 나눈다.
        Map map = cards.stream().collect(Collectors.groupingBy(Card::getCardId));

        List<Card> list = (List) map.get("1");

        list.forEach(s-> System.out.println(s.getUserName()));
    }
}
