package ropo_thread;

public class main {
    public static void main(String []args) throws InterruptedException {

        robo ai = new robo("sam");


        Runnable taskLeft = new Runnable() {
            public synchronized void run() {
                try {

                            ai.goLeft();
                            ai.notifyAll();
                            ai.wait();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable taskRight = new Runnable() {
            public synchronized void run() {
                try {
                    System.out.println("И тут жив");
                    //ai.wait();
                    ai.goRight();
                    ai.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread threadLeft = new Thread(taskLeft);

        Thread threadRight = new Thread(taskRight);

        threadLeft.start();
        threadRight.start();

System.out.println("Я жив");

    }

}
