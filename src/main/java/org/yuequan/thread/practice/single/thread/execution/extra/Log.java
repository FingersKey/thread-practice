package org.yuequan.thread.practice.single.thread.execution.extra;

public class Log {
    public static void println(String s){
        System.out.println(Thread.currentThread().getName() + ":" + s);
    }
}
