package com.app;

import java.util.Properties;
import java.util.Timer;

//import javax.servlet.MultipartConfigElement;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.ui.velocity.VelocityEngineFactoryBean;
//import org.springframework.web.multipart.MultipartResolver;

import com.app.Application;
import com.app.rest.RestResource;
import com.app.rest.image_upload;
//import com.app.service.MessageService;
import com.app.config.JerseyConfig;
import com.app.config.MailConfig;
import com.app.data_import.dataImport;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,VelocityAutoConfiguration.class })
@ComponentScan(basePackageClasses = {RestResource.class, MailConfig.class, image_upload.class})//, MessageService.class})
public class Application extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
	
    public static void main(String[] args) throws Exception {
        /*new SpringApplicationBuilder(Application.class)
                .showBanner(false)
                .run(args);*/
    	SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/abcc/*");
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
        return registration;
  
    }
    
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
     
        return new EmbeddedServletContainerCustomizer() {
            //@Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
     
                ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/underconst.html");
                ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/server_err.html");
     
                container.addErrorPages(error401Page, error404Page, error500Page);
            }
        };
    }
    
    @Bean(name = "velocityEngine")
    public VelocityEngineFactoryBean velocityEngineFactoryBean() {
        VelocityEngineFactoryBean vefb = new VelocityEngineFactoryBean();
        Properties p = new Properties();
        p.put("resource.loader", "class");
        p.put("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        vefb.setVelocityProperties(p);
        return vefb;
    }
    
}