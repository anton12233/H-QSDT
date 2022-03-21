package ropo_thread;

public class robo {

    String name;
    private boolean leftGO =  true;
    private boolean rightGO = false;
    private int leftStepCount = 0;
    private int rightStepCount = 0;

    public robo (String name){
        this.name = name;
    }

    public void switchLegs(){
        if (this.leftGO)
        {
            this.leftGO = false;
            this.rightGO = true;
        }else{
            this.leftGO = true;
            this.rightGO = false;
        }
    }

    public synchronized void  goLeft() throws InterruptedException {
        if (this.rightGO){
            wait();
        }
        leftStepCount++;
        System.out.println("I go on left leg");
        System.out.println("I stop on left leg");
        this.leftGO = false;
        this.rightGO = true;
        notify();
    }

    public synchronized void goRight() throws InterruptedException {
        if (this.leftGO){
            wait();
        }
        rightStepCount++;
        System.out.println("I go on right leg");
        System.out.println("I stop on right leg");

        this.rightGO = false;
        this.leftGO = true;

        notify();
    }

    public int getLeftStepCount() {
        return leftStepCount;
    }

    public int getRightStepCount() {
        return rightStepCount;
    }
}
