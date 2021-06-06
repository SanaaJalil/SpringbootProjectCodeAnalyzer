package de.fraunhofer.iese.AnalyzerProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="de.fraunhofer.iese.controller")
public class AnalyzerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalyzerProjectApplication.class, args);
	}

}
