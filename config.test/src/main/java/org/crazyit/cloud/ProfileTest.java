package org.crazyit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ProfileTest {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MyConfigApp.class).properties("spring.profiles.active=windows","server.port=9999").run(args);

	}

}
