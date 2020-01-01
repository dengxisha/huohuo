package com.singleton;

public class ESingleton {
    private ESingleton(){}
    private static ESingleton s= new ESingleton();
    public static ESingleton getInstance(){
        return s;
    }
}
