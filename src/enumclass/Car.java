package enumclass;

public enum Car implements CarFunc {
    SORENTO(10000,"RV"){

        public void showCarInfo(){
            System.out.println("쏘렌토");
            System.out.println("쏘렌토 가격은 : "+getValue());
            System.out.println("쏘렌토 타입은 : "+getType());
            start();
        }
    },
    SANTAFE(11000,"RV"){
        public void showCarInfo(){
            System.out.println("싼타페");
            System.out.println("싼타페 가격은 : "+getValue());
            System.out.println("싼타페 타입은 : "+getType());
            start();
        }
    },
    AVANTE(6000,"SEDAN"){
        public void showCarInfo(){
            System.out.println("아반떼");
            System.out.println("아반떼의 가격은 : "+getValue());
            System.out.println("아반떼의 타입은 : "+getType());
            start();
        }
    },
    CORANDO(8000,"RV"){
        public void showCarInfo(){
            System.out.println("코란도");
            System.out.println("코란도 가격은 : "+getValue());
            System.out.println("코란도 타입은 : "+getType());
            start();
        }
    };
    private int value;
    private String type;

    private Car(int value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", type='" + type + '\'' +
                '}';
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    /**
     * 추상메서드를 사용하면 상수에서의 메서드 재정의가 가능하다
     * enum의 확장성이 증가한다
     * 컴파일 시점에 오류를 확인할 수 있다. (객체의 생성 전에)
     * */
    public abstract void showCarInfo();

    @Override
    public void start() {
        System.out.println("Car START");
    }
}
