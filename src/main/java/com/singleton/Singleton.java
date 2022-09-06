package com.singleton;

public class Singleton {
    //다른 방식은 notion 참조 dcl 문제있음...
    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            synchronized(Singleton.class) {      //1
                Singleton inst = instance;         //2
                if (inst == null)
                {
                    synchronized(Singleton.class) {  //3
                        inst = new Singleton();        //4
                    }
                    instance = inst;                 //5
                }
            }
        }
        return instance;
    }
}
