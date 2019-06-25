package org.crazyit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MyConfigApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SpringApplication.run(MyConfigApp.class, args);
		new SpringApplicationBuilder(MyConfigApp.class).properties("spring.config.location=classpath:/config/abc.properties").run(args);

	}

}
