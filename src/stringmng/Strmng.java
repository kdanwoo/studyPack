package stringmng;

public class Strmng {
    public static void main(String[] args) {
        String str = "test";
        str = "string " + str;

        StringBuffer stringBuffer = new StringBuffer("test");
        stringBuffer.append(" string");

        StringBuilder stringBuilder = new StringBuilder("test");
        stringBuffer.append(" string");
    }
}
