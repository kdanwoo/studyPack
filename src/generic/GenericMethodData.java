package generic;

public class GenericMethodData {

    public static <T> T showData(T data){
        if(data instanceof String){
            System.out.println("String");
        }else if(data instanceof Integer){
            System.out.println("Integer");
        }else if(data instanceof Double)
            System.out.println("Double");

        return data;
    }
}
