package com.example.spring.core;

import org.springframework.stereotype.Component;

@Component 
/** 
 * @Component {@link Component @Component} used for annotaing a class is component
 * @Repository {@link Repository @Repository} basically used in DAO layer
 * @Service {@link Service @Service} used for service layer or util layer
 * @Controller {@link Controller @Controller} used for front controller
 * all four annotaion are stereotype annotaion and used by spring to configure
 *  a bean in application context.
 *  if an annotation is missed NoSuchBeanException will be thrown.
*/
public class Student {

}
