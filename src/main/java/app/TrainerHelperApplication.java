package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"app", "database"})
@EntityScan("database")
@EnableJpaRepositories("database")
public class TrainerHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainerHelperApplication.class, args);
    }

}
