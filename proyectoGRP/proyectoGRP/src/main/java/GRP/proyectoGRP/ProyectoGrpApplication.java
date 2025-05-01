package GRP.proyectoGRP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"GRP.proyectoGRP", "com.rstelecom.repositorio"})
@EnableJpaRepositories(basePackages = "com.rstelecom.repositorio")
@EntityScan(basePackages = "com.rstelecom.modelo")  // si tus entidades también están fuera
public class ProyectoGrpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoGrpApplication.class, args);
	}

}



