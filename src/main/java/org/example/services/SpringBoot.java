package org.example.services;

public class SpringBoot implements  Icourse{

    public SpringBoot(){
        System.out.println("SpringBoot Bean Created..");
    }
    /**
     * @param price 
     * @return
     */
    @Override
    public Boolean getTheCourse(Double price) {
        System.out.println("SpringBoot Course is Purchased successfully and fees paid is "+ price);
        return true;
    }
}
