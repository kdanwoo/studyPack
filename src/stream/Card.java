package stream;

public class Card {
    private String cardId;
    private String userName;
    private int totalSpent;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(int totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Card() {
    }

    public Card(String cardId, String userName, int totalSpent) {
        this.cardId = cardId;
        this.userName = userName;
        this.totalSpent = totalSpent;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId='" + cardId + '\'' +
                ", userName='" + userName + '\'' +
                ", totalSpent=" + totalSpent +
                '}';
    }
}
