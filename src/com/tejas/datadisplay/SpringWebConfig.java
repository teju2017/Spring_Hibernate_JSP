package com.tejas.datadisplay;

/*  This class is required when we configure the Freemarker
 *  using the annotation, Currently this is configured in the 
 *  spring-mvc-demo-Servlet.xml file
 */  

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.result.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;



@EnableWebMvc
@Configurable
@ComponentScan({"com.tejas.datadisplay"})
public class SpringWebConfig 
{
	/*@Bean(name = "viewResolver")
	public FreeMarkerViewResolver freemarkerViewResolver()
	{ 
	    FreeMarkerViewResolver resolver = new FreeMarkerViewResolver(); 
	    resolver.setCache(true); 
	    resolver.setPrefix(""); 
	    resolver.setSuffix(".ftl"); 
	    return resolver; 
	}
	
	@Bean(name = "freemarkerConfig")
	public FreeMarkerConfigurer freemarkerConfig() { 
	    FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer(); 
	    freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/views/freemarker/");
	    return freeMarkerConfigurer; 
	} */
	
	

}
