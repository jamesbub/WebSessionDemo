package com.biswajeet.websessiondemo.controller;

import javax.servlet.ServletContextListener;

import org.apache.ignite.cache.websession.WebSessionFilter;
import org.apache.ignite.startup.servlet.ServletContextListenerStartup;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IgniteConfig {
	
	/*@Bean
	public ServletListenerRegistrationBean<ServletContextListener> igniteServletContextListenerRegistrationBean() {
		ServletListenerRegistrationBean<ServletContextListener> bean = new ServletListenerRegistrationBean<ServletContextListener>();
		bean.setListener(new ServletContextListenerStartup());
		return bean;
	}


	// Register Ignite Filter
		@Bean
		public FilterRegistrationBean<WebSessionFilter> igniteFilterRegistrationBean() {
			FilterRegistrationBean<WebSessionFilter> bean = new FilterRegistrationBean<WebSessionFilter>(new WebSessionFilter());
			bean.addUrlPatterns("/*");
			//bean.addInitParameter("IgniteWebSessionsCacheName", "web-session-cache");
			return bean;
		}
		*/
		
}
