package com.vpr;

import java.util.Random;

class threads extends Thread {
    @Override
    public void run() {
        Random time = new Random();
        for(int i=0; i<10; i++) {
            System.out.println("Value " + i);
            try {
                Thread.sleep(time.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //super.run();
    }
}
public class Demo {
    public static void main(String[] args) {
        threads threads1 = new threads();
        threads1.start();
        threads threads2 = new threads();
        threads2.start();
        threads threads3 = new threads();
        threads3.start();
    }
}

