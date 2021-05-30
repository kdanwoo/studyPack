package basic;

public class BankTest {
    public static void main(String[] args) {
        KakaoBank bank = new KakaoBank();
        bank.load();
        bank.save();
        bank.loan("카카오뱅크");
        Bank.test();
    }
}
