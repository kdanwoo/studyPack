package basic;

public interface Bank {
    public void save();
    public void load();
    default void loan(String name){
        System.out.println(name+" 대출실행");
    };
    static void test(){
        System.out.println("static 메서드 구현체, class명으로 직접 호출");
    }
}
