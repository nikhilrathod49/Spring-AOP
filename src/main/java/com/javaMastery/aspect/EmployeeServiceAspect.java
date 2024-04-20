package com.javaMastery.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.javaMastery.model.Employee;

@Aspect // cross cutting concern
@Component
public class EmployeeServiceAspect {

	/*
	 * 
	// Advice // jointpoint // wild card // args
	@Before(value = "execution(* com.javaMastery.model.Employee.set*(..)) and args(id) ")
	public void beforeAdvice(JoinPoint joinPoint, String id) {
		System.out.println(" beforeAdvice called " + joinPoint.getSignature());
		System.out.println("Advice value =  " + id);
	}

	@After(value = "execution(* com.javaMastery.model.Employee.set*(..)) and args(id) ")
	public void afterAdvice(JoinPoint joinPoint, String id) {
		System.out.println(" afterAdvice called " + joinPoint.getSignature());
		System.out.println("Advice value =  " + id);
	}

	// @Around ==> Before and After

	@AfterReturning(value = "execution(public com.javaMastery.model.Employee createEmployee(..))", returning = "employee")
	public void afterReturning(JoinPoint joinPoint, Employee employee) {
		System.out.println(" afterReturning called " + joinPoint.getSignature());
		System.out.println(" afterReturning called = EmpId = " + employee.getId());
	}

	@AfterThrowing(value = "execution(public com.javaMastery.model.Employee createEmployee(..))", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		System.out.println("afterThrowing called " + joinPoint.getSignature());
		System.out.println("Exception occured in afterThrowing method = " + ex.getMessage());
	}
	
	*
	*/
	
	@Before(value = "allSetName()")
	public void beforeAdvice(JoinPoint joinPoint ) {
		System.out.println(" beforeAdvice called " + joinPoint.getSignature());
	}
	
	@Pointcut(value = "execution(public void setName(..))")
	public void allSetName() {
	}
}
