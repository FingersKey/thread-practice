package org.yuequan.thread.practice.single.thread.execution.good;

public class Gate {
    private String name = "Nobody";
    private String address = "Nowhere";
    private int counter = 0;

    synchronized public void pass(String name, String address){
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    @Override
    synchronized public String toString() {
        return "No." + counter + ":" + name + "," + address;
    }

    public void check(){
        if (name.charAt(0) != address.charAt(0)){
            System.out.println("****** BROKEN ****** " + toString());
        }
    }
}
