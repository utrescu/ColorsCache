package net.xaviersala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ColorsCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColorsCacheApplication.class, args);
		
		
	}
}
