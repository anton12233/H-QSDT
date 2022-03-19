package ropo_thread;

public class robo {

    String name;
    private boolean leftGO =  true;
    private boolean rightGO = false;

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

    public void goLeft() throws InterruptedException {
        if (this.rightGO){
            wait();
        }

        System.out.println("I go on left leg");
        Thread.sleep(100);
        System.out.println("I stop on left leg");
        this.leftGO = false;
        this.rightGO = true;
        notify();
    }

    public void goRight() throws InterruptedException {
        if (this.leftGO){
            wait();
        }
        System.out.println("I go on right leg");
        Thread.sleep(100);
        System.out.println("I stop on right leg");

        this.rightGO = false;
        this.leftGO = true;

        notify();
    }

}
