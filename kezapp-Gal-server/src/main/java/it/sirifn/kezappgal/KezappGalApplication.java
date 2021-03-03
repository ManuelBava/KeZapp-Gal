package it.sirifn.kezappgal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"it.sirfin.kezappgal"})
@EnableJpaRepositories(basePackages = {"it.sirfin.kezappgal.repository"})
@EntityScan(basePackages = {"it.sirfin.kezappgal.model"})
public class KezappGalApplication {

    public static void main(String[] args) {
        SpringApplication.run(KezappGalApplication.class, args);
    }

}
