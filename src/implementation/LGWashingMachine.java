package implementation;

public class LGWashingMachine implements WashingMachine, Drycouse{

    @Override
    public void startButtonPressed() {
        System.out.println("START");
    }

    @Override
    public void pauseButtonPressed() {
        System.out.println("PAUSE");
    }

    @Override
    public void stopButtonPressed() {
        System.out.println("STOP");
    }

    @Override
    public int changeSpeed(int speed) {
        int rtnSpeed = 0;

        switch (speed){
            case 1 :
                rtnSpeed = 20;
                break;
            case 2 :
                rtnSpeed = 50;
                break;
            case 3 :
                rtnSpeed = 100;
                break;
        }

        return rtnSpeed;

    }

    @Override
    public void dry() {
        System.out.println("DRY");
    }
}
