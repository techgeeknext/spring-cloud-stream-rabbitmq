package com.tech.geek.next.emp.springcloudstreamamqprabbitmqproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;


@EnableBinding(EmployeeBinding.class)
@SpringBootApplication
public class SpringCloudStreamAmqpRabbitmqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamAmqpRabbitmqProducerApplication.class, args);
	}
}
