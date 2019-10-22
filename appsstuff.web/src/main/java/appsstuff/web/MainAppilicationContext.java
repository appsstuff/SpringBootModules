package appsstuff.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"appsstuff"})
@EntityScan(basePackages = {"appsstuff"})
@ComponentScan(basePackages = {"email","appsstuff.web.test.demo.controller"})
	public class MainAppilicationContext {

	public static void main(String[] args) {
		SpringApplication.run(MainAppilicationContext.class,args);
			
	}

}
