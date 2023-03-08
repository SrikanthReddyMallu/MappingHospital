package com.mapping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalMain 
{
public static void main(String[] args) 
{
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configure.xml");
	Hospital hospital = (Hospital) applicationContext.getBean("myhospital");
	
	System.out.println(hospital.getId());
	System.out.println(hospital.getName());
	System.out.println(hospital.getWebsite());
	System.out.println(hospital.getPhno());
	System.out.println(hospital.getBnameLocation());
}
}
