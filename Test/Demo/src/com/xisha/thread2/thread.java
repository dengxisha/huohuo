package com.xisha.thread2;

public class thread {
    public static void main(String[] args) {
        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println(12121);
            }
        }).start();
    }
}
