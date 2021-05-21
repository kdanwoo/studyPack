package abstarctTest;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> calList = new ArrayList<Car>();

        calList.add(new Santafe("LEE"));
        calList.add(new Sorento("KIM"));

        String[] nameSet = new String[2];
        nameSet[0] = "choi";
        nameSet[1] = "david";
        int i = 0;

        for(Car car : calList){
            car.run();
            car.changeUserName(nameSet[i]);
            car.run();
            i++;
        }





    }
}
