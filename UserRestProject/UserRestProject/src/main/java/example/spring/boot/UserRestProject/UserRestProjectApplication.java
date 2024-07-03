package example.spring.boot.UserRestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com"})
@EnableJpaRepositories(basePackages = "com")
@EntityScan(basePackages = "com")
public class UserRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRestProjectApplication.class, args);
	}

}
