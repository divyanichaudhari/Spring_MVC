package com.spring.app;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankAspect {
	final static Logger logger = Logger.getLogger("BankAspect.class");
	
	
    @Before("execution(* com.spring.app.Bank.withdraw(..))")
    
	public Object logTransactionStatus(ProceedingJoinPoint pjp) throws Throwable {
		
    	SimpleDateFormat Sd = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
    	
    	Date date = new Date();
    	
    	logger.info(Sd.format(date) + "- Before ");
//implement the required cross cutting concern
		return null;
		
}

	
}