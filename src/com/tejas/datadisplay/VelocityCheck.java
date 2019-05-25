package com.tejas.datadisplay;

import java.io.StringWriter;



import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;


import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class VelocityCheck
{
   public void configure()
   {
	   VelocityEngine ve = new VelocityEngine();
	   ve.init();
	   Template t = ve.getTemplate("/spring-mvc-demo/WebContent/WEB-INF/chk.vm");
	   VelocityContext vt = new VelocityContext();
	   vt.put("abc", "teju");
	   StringWriter str = new StringWriter();
	   t.merge(vt,str);
	   System.out.println(str);
   }
   
}
