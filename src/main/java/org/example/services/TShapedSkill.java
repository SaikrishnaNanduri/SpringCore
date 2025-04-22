package org.example.services;

import org.springframework.stereotype.Component;


public class TShapedSkill implements  Icourse
{
   private Icourse icourse;

    public TShapedSkill(Icourse icourse) {
        super();
        this.icourse = icourse;
        System.out.println("TShapedSkill Bean Created through Constructor..");
    }

    public TShapedSkill(){
        System.out.println("TShapedSkill Bean Created..");
    }
    public void setCourse(Icourse icourse){
        this.icourse =icourse;
    }
    @Override
    public Boolean getTheCourse(Double amount) {
        return icourse.getTheCourse(amount);
    }
}
