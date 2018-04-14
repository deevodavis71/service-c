package org.example.consulkubedemo;

import org.example.consulkubedemo.utils.MyProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@Configuration

public class ConsulKubeDemoApplication {
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ConsulKubeDemoApplication.class, args);
	}

	@RequestMapping("/myenv")
	public String env(@RequestParam("prop") String prop) {
		return env.getProperty(prop, "Not Found");
	}

	@Autowired
	private MyProps myprops;



	@GetMapping("/getKV")
	public String getConfigFromValue() {
		return myprops.getServicec();
	}
}
