package pe.com.librerapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class EjercicioEverisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioEverisApplication.class, args);
		log.info("---> Load Complete!!");
	}

}
