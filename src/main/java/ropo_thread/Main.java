package ropo_thread;
//Реализуйте класс робота, имеющего 2 ноги. Каждая нога осуществляет работу (шаг) в отдельном потоке.
//Необходимо выполнить одно условие: шаги выполняются поочередно разными ногами. При этом неважно с какой ноги начинает ходить робот.

public class Main {
    public static void main(String []args) throws InterruptedException {

        robo ai = new robo("sam");
        ai.switchLegs();

        Runnable taskLeft = new Runnable() {
            public synchronized void run() {
                synchronized (ai) {
                    try {
                        while (true) {
                            ai.goLeft();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable taskRight = new Runnable() {
            public synchronized void run() {
                synchronized (ai){
                    try {
                        while (true) {
                            ai.goRight();
                        }
                    }catch (InterruptedException e) {
                    e.printStackTrace();
                }}
            }
        };

        Thread threadLeft = new Thread(taskLeft);
        Thread threadRight = new Thread(taskRight);

        threadLeft.start();
        threadRight.start();

    }

}
