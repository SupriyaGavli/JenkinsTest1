package com.infosys.exercise;
import org.apache.log4j.Logger;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//Starter class. This application works with AnnotationConfigApplicationContext and no XML is needed.
@ComponentScan(basePackages={"exercise"})
public class EmployeeStarter {
	
	static Logger log = Logger.getLogger(EmployeeStarter.class);
    public static void main(String[] args)     {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.register(ConfigurationFactory.class);
        appContext.refresh();
        Employee employee = (Employee)appContext.getBean("employee");
        log.info(employee.getName());
        //System.out.println(log);
        appContext.close();
    }
}