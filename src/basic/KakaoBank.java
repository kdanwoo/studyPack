package basic;

public class KakaoBank implements Bank{
    @Override
    public void save() {
        System.out.println("카카오뱅크 돈 저장");
    }

    @Override
    public void load() {
        System.out.println("카카오뱅크 잔액조회");
    }
}
