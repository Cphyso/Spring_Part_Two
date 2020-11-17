package PartTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PartTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartTwoApplication.class, args);
	}
}
