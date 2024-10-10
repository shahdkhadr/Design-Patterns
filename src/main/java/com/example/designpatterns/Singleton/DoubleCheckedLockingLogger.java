package com.example.designpatterns.Singleton;

public class DoubleCheckedLockingLogger {
    private static volatile DoubleCheckedLockingLogger instance;
    private DoubleCheckedLockingLogger(){

    }
    public static DoubleCheckedLockingLogger getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLockingLogger.class){
                if(instance == null){
                    instance = new DoubleCheckedLockingLogger();
                }
            }
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
