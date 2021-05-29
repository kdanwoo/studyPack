package enumclass;

public class CarEnumTest {
    public static void main(String[] args) {
        Car car = Car.CORANDO;

        switch (car){
            case AVANTE:
                System.out.println("아반떼");
                System.out.println("아반떼의 가격은 : "+car.getValue());
                System.out.println("아반떼의 타입은 : "+car.getType());
                break;
            case CORANDO:
                System.out.println("코란도");
                System.out.println("코란도 가격은 : "+car.getValue());
                System.out.println("코란도 타입은 : "+car.getType());
                break;
            case SORENTO:
                System.out.println("쏘렌토");
                System.out.println("쏘렌토 가격은 : "+car.getValue());
                System.out.println("쏘렌토 타입은 : "+car.getType());
                break;
            case SANTAFE:
                System.out.println("싼타페");
                System.out.println("싼타페 가격은 : "+car.getValue());
                System.out.println("싼타페 타입은 : "+car.getType());
                break;
        }

    }
}
