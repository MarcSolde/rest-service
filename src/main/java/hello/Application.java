package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//new import for using jboss
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@SpringBootApplication
public class Application extends SpringBootServletInitializer{ //Extends on Jbosss
//Overtride for Jboss
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


//http://dev.macero.es/2015/06/07/how-to-deploy-a-spring-boot-war-in-wildfly-jboss/
