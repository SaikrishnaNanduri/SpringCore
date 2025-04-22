package org.example.main.service;

public class Password {

    public String algo;

    public Password(String algo){
        this.algo =algo;
        System.out.println( "Password Bean is created ");
    }
    public String aboutAlgo(){
        return "Algo is used "+algo;
    }
}
