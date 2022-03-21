package ropo_thread;
//Реализуйте класс робота, имеющего 2 ноги. Каждая нога осуществляет работу (шаг) в отдельном потоке.
//Необходимо выполнить одно условие: шаги выполняются поочередно разными ногами. При этом неважно с какой ноги начинает ходить робот.

import com.google.common.base.Stopwatch;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String []args) throws InterruptedException {


        robo ai = new robo("sam");
        go(1L, ai);
        go(1L, ai);
        go(1L, ai);

    }


    static void go(long dur, robo ai) throws InterruptedException {

        ai.switchLegs();
        Stopwatch stopwatch = Stopwatch.createStarted();


        Runnable taskLeft = new Runnable() {
            public synchronized void run() {
                synchronized (ai) {
                    try {
                        while (stopwatch.elapsed(TimeUnit.SECONDS) < dur) {
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
                        while (stopwatch.elapsed(TimeUnit.SECONDS) < dur) {
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


        for (Thread thread : Arrays.asList(threadLeft, threadRight)) {
            thread.join();
        }
        stopwatch.stop();
    }
}
