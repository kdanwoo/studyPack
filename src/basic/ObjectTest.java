package basic;

public class ObjectTest {
    public static void main(String[] args) {
        String str1 = new String("111");
        String str2 = new String("111");

        String str3 = "111";
        String str4 = "111";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
