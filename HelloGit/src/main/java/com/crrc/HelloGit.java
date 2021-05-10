package com.crrc;

public class HelloGit {

    public String name;

    public HelloGit(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    public static void main(String[] args) {
        HelloGit h = new HelloGit("GIt");

        System.out.println(h.toString());
    }
}
