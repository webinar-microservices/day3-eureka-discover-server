package in.webinar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Day3EurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day3EurekaDiscoveryServerApplication.class, args);
	}

}
