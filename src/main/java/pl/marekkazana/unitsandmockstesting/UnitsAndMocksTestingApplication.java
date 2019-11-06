package pl.marekkazana.unitsandmockstesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
public class UnitsAndMocksTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitsAndMocksTestingApplication.class, args);
    }


    @Autowired
    private AnimalRepo animalRepo;


    @EventListener(ApplicationReadyEvent.class)
    public void init(){
        animalRepo.save(new Animal("dog"));
        animalRepo.save(new Animal("cat"));
    }
}
