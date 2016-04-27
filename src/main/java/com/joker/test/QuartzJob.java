package com.joker.test;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.impl.JobDetailImpl;

/**
 * Created by pengweiyuan on 4/22/16.
 */
public class QuartzJob implements Job{
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDetail jobDetail=jobExecutionContext.getJobDetail();
        String jobName = ((JobDetailImpl)jobDetail).getName();   //任务名称

        System.err.println(jobName);
       /* org.quartz.plugins.xml.JobInitializationPlugin()*/
    }
}
