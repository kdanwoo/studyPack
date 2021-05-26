package overtest;

class Car{
    public String madeByName;
    public int year;

    public void info(){
        System.out.println("이 차의 제조사는 : "+this.madeByName+", 연식은 : "+this.year+"년식입니다");
    }
}

class Sorento extends Car{
    public String userName;
    public void info(){
        super.info();
        System.out.println("이 차의 주인은 : "+userName);
        System.out.println("이 차의 제조사는 : "+madeByName);
        System.out.println("이 차의 제조년도는 : "+year);
    }
}


public class OverridingTest {
    public static void main(String[] args) {
        Sorento sorento = new Sorento();
        Car car = new Sorento();

        car.madeByName = "TEST";
        car.year = 2021;
        car.info();

        sorento.userName = "KDW";
        sorento.madeByName = "KIA";
        sorento.year = 2020;

        sorento.info();
    }
}
