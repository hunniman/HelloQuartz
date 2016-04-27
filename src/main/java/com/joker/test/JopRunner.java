package com.joker.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by pengweiyuan on 4/22/16.
 */
public class JopRunner {
   public static void main(String[]args){
       try {
           SchedulerFactory schedulerFactory=new StdSchedulerFactory("quartz.properties");
           Scheduler scheduler=schedulerFactory.getScheduler();
           scheduler.start();
       } catch (SchedulerException e) {
           e.printStackTrace();
       }

   }

}
