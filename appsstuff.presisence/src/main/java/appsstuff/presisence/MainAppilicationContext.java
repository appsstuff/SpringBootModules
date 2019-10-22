package appsstuff.presisence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"appsstuff.com.	"})
public class MainAppilicationContext {

	public static void main(String[] args) {
		ApplicationContext acx= 	SpringApplication.run(MainAppilicationContext.class,args);
			
	}

}
