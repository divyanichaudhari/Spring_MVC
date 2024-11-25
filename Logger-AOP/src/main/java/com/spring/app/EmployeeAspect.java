package com.spring.app;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
@Aspect
@Component
public class EmployeeAspect {
	final static Logger logger=Logger.getLogger("EmployeeAspect.class");
    // Advice to execute after the registerEmployee method returns successfully
    @AfterReturning(pointcut = "registerEmployeePointcut(..)", returning = "result")
    public void logRegistrationStatus(Object result) {
        SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd HH:mm:SS");
        Date date=new Date();
        logger.info(sdf.format(date)+"Registration Successful");
    }
}