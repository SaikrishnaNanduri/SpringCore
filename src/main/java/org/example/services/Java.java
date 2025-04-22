package org.example.services;

public class Java implements Icourse {

    public Java(){
        System.out.println("Java Bean Created..");
    }

    @Override
    public Boolean getTheCourse(Double price) {
        System.out.println("Java Course is Purchased successfully and fees paid is "+ price);
        return true;
    }
}
