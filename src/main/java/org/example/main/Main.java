package org.example.main;

import org.example.main.config.Config;
import org.example.main.service.Password;
import org.example.services.TShapedSkill;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //TUTORIAL FROM : https://www.youtube.com/watch?v=zEGC-Pyiv_s&t=5077s
       /* System.out.println("Hello Spring Core");

        TShapedSkill tShapedSkill =new TShapedSkill();
        // with java object
        //Injecting Java (dependent class) to target class(TShaped Skill) is called DI
      //  Java java =new Java();
      //  tShapedSkill.setCourse(java); //Injecting  java (dependent) through Setter then it is called Setter DI
        // tShapedSkill.setCourse(new Java()); // other way of injecting Java Object

        // with SpringBoot object
        SpringBoot springBoot =new SpringBoot();
       tShapedSkill.setCourse(springBoot); //Injecting  SpringBoot (dependent) through Setter then it is called Setter DI
        // tShapedSkill.setCourse(new SpringBoot()); // other way of injecting SpringBoot Object

        Boolean b =tShapedSkill.getTheCourse(4999.7);
        if(b){
            System.out.println("Success");
        }*/

    // This is for Application context
        // Now with IOC container we ll do injecting Objects
        // Two Types of Container
        // 1.ApplicationContext
        // 2.Bean Factory
        // Starts with Application Context
      /*  ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationconfig.xml");
        TShapedSkill tShapedSkill =applicationContext.getBean(TShapedSkill.class);
        Boolean aBoolean =tShapedSkill.getTheCourse(454.4);
        if(aBoolean){
            System.out.println("Successfully Purchased.");
        }else{
            System.out.println("Failed to get Course");
        }*/

        //This is for annotation based Bean Creation
      //  ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationconfig.xml");

        //This is for annotation based configuation and check Config class where we used Component scan annotation
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(Config.class);
        Password pass =applicationContext.getBean(Password.class);
        pass.aboutAlgo();

    }
}
