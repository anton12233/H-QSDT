package ropo_thread;

public class robo {

    String name;
    private boolean leftGO = false;
    private boolean rightGO = false;

    public robo (String name){
        this.name = name;
    }

    public void goLeft() throws InterruptedException {
        this.leftGO = true;
        System.out.println("I go on left leg");
        Thread.sleep(100);
        System.out.println("I stop on left leg");

        this.leftGO = false;
    }


    public void goRight() throws InterruptedException {
        this.rightGO = true;
        System.out.println("I go on right leg");
        Thread.sleep(100);
        System.out.println("I stop on right leg");

        this.rightGO = false;
    }

}
