package implementation;

public class TestWashingMachine {
    public static void main(String[] args) {
        LGWashingMachine lgWashingMachine = new LGWashingMachine();
        lgWashingMachine.startButtonPressed();
        System.out.println(lgWashingMachine.changeSpeed(3));
    }
}
