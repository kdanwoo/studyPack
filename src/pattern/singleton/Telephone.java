package pattern.singleton;

public class Telephone {
    private static Telephone telephone = new Telephone();
    private static int count = 0;

    /**
     * 생성자를 private로 해둠 -> 외부에서 인스턴스 생성를 못함
     * Telephone 클래스가 제공하는 static 메서드만 사용하면 되기때문에 굳이 생성자가 필요없다
     * */
    private Telephone(){}

    public static Telephone getInstance() {
/*        if (telephone == null){
            telephone = new Telephone();
        }*/
        return telephone;
    }

    public synchronized static void calling(String phoneNum){
        count++;
        System.out.println("calling to : "+phoneNum);
    }
}
