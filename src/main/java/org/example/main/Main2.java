package org.example.main;

import org.example.services.TShapedSkill;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
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


        // Now with IOC container we ll do injecting Objects
        // Two Types of Container
        // 1.ApplicationContext
        // 2.Bean Factory
        // Second with Bean Factory

        DefaultListableBeanFactory defaultListableBeanFactory =new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(defaultListableBeanFactory);
        reader.loadBeanDefinitions("applicationconfig.xml");
        /*TShapedSkill tShapedSkill =defaultListableBeanFactory.getBean(TShapedSkill.class);
        Boolean aBoolean =tShapedSkill.getTheCourse(454.4);*/
        /*if(aBoolean){
            System.out.println("Successfully Purchased.");
        }else{
            System.out.println("Failed to get Course");
        }*/

    }
}
