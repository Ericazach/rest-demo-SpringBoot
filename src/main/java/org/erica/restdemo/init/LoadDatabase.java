package org.erica.restdemo.init;

import org.erica.restdemo.model.Empleado;
import org.erica.restdemo.repository.EmpleadoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmpleadoRepository repository) {
        return args -> {
            Empleado erica = new Empleado("Erica", "CEO");
            Empleado alan = new Empleado("Alan", "Developer");
            Empleado jose = new Empleado("Jose", "Developer");
            
            log.info("Carga inicial : {}", repository.save(erica));
            log.info("Carga inicial : {}", repository.save(alan));
            log.info("Carga inicial : {}", repository.save(jose));
        };
    }
}
