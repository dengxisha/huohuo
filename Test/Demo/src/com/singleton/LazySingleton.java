package com.singleton;

public class LazySingleton {
    private LazySingleton(){}

    private static class LazyLoad{
        static LazySingleton s=new LazySingleton();
    }
    public  static  LazySingleton getInstance(){
        return LazyLoad.s;
    }
}
