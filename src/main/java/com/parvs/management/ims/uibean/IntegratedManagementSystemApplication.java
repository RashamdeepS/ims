package com.parvs.management.ims.uibean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.EnumSet;
import javax.faces.webapp.FacesServlet;
import javax.servlet.DispatcherType;
import org.ocpsoft.rewrite.servlet.RewriteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@EnableAutoConfiguration
@ComponentScan({"com.hrm.management.*"})
@EnableJpaRepositories
public class IntegratedManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegratedManagementSystemApplication.class, args);
	}
	
	  @Bean
	    public ServletRegistrationBean servletRegistrationBean() {
	        FacesServlet servlet = new FacesServlet();
	        return new ServletRegistrationBean(servlet, "*.xhtml");
	    }
	  
	    @Bean
	    public FilterRegistrationBean rewriteFilter() {
	        FilterRegistrationBean rwFilter = new FilterRegistrationBean(new RewriteFilter());
	        rwFilter.setDispatcherTypes(EnumSet.of(DispatcherType.FORWARD, DispatcherType.REQUEST,
	                DispatcherType.ASYNC, DispatcherType.ERROR));
	        rwFilter.addUrlPatterns("/*");
	        return rwFilter;
	    }
	    
}
