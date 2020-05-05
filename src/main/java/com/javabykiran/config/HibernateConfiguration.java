package com.javabykiran.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.javabykiran.hibernate.Downloads;
import com.javabykiran.hibernate.Links;
import com.javabykiran.hibernate.Operators;
import com.javabykiran.hibernate.Registration;
import com.javabykiran.hibernate.State;
import com.javabykiran.hibernate.Users;



@Configuration
@PropertySource("classpath:application.properties")
@EnableWebMvc
@ComponentScan("com.javabykiran.hibernate")
@EnableAspectJAutoProxy
public class HibernateConfiguration {

	@Autowired
	private ApplicationContext context;

	 
	@Bean
	public LocalSessionFactoryBean getSessionFactory()  
	{
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		factoryBean.setAnnotatedClasses(Registration.class, Users.class, State.class, Links.class, Operators.class, Downloads.class);
		return factoryBean;
	}
}
