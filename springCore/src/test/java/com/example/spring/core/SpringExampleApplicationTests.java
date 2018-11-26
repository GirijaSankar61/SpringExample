package com.example.spring.core;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringExampleApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Test
	public void contextLoads() {
	}

	@Test
	public void noException() {
		Student student = context.getBean(Student.class);
		assertNotNull(student);
	}

	@Test(expected = NoSuchBeanDefinitionException.class)
	public void NoSuchBeanDefinationException() {
		Bean1 bean1 = context.getBean(Bean1.class);
		assertNotNull(bean1);
	}
	@Test(expected = NoSuchBeanDefinitionException.class)
	public void NoSuchBeanDefinationException2() {
		Bean1 bean1 = (Bean1) context.getBean("bean");
		assertNotNull(bean1);
	}

}
