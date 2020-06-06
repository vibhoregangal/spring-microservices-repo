package org.example;

import org.example.bean.Coach;
import org.example.bean.CricketCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        Logger logger=Logger.getLogger("org.example.App");
        try {
            logger.log(Level.INFO,"started context");
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach coach=context.getBean("theCoach", CricketCoach.class);
            logger.log(Level.INFO,"reading method from coach");
            System.out.printf("\nyour daily workout plan for the day is: %s : ",coach.getDailyWorkout()+"\n");
            System.out.printf("\nlet me tell you your fortune of the day: %s",coach.getDailyFortune());
            logger.log(Level.INFO,"done..");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
