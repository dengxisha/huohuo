package com.xisha.thread;

public class Main {
    public static void main(String[] args) {
        Runnable a=new mThread();
        new Thread(a).start();
    }
}
