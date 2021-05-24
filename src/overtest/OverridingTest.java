package overtest;

class Car{
    public String madeByName;
    public int year;

    public void info(){
        System.out.println("이 차의 제조사는 : "+madeByName+", 연식은 : "+year+"년식입니다");
    }
}

class Sorento extends Car{
    public String userName;
    public void info(){
        super.info();
        System.out.println("이 차의 주인은 : "+userName);
    }
}


public class OverridingTest {
    public static void main(String[] args) {
        Sorento sorento = new Sorento();

        sorento.userName = "KDW";
        sorento.madeByName = "KIA";
        sorento.year = 2020;

        sorento.info();
    }
}
