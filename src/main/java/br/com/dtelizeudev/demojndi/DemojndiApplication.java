package br.com.dtelizeudev.demojndi;

import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.jdbc.pool.DataSourceFactory;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemojndiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojndiApplication.class, args);
	}

	@Bean
	public TomcatServletWebServerFactory tomcatFactory() {
		return new TomcatServletWebServerFactory() {

			@Override
			protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
				tomcat.enableNaming();
				return super.getTomcatWebServer(tomcat);
			}

			@Override
			protected void postProcessContext(Context context) {
				ContextResource resource = new ContextResource();
				resource.setName("jdbc/HTML_MSSQLDS");
				resource.setType(DataSource.class.getName());
				resource.setProperty("factory", DataSourceFactory.class.getName());
				resource.setProperty("driverClassName", "net.sourceforge.jtds.jdbc.Driver");
				resource.setProperty("url", "jdbc:jtds:sqlserver://1.1.0.1:1433/db_Bradesco_NeoFlow_Desenv;");
				resource.setProperty("username", "");
				resource.setProperty("password", "");

				context.getNamingResources().addResource(resource);
			}
		};
	}

}
