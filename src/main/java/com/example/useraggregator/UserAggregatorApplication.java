package com.example.useraggregator;

import com.example.useraggregator.conf.DataSourcesProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DataSourcesProperties.class)
public class UserAggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAggregatorApplication.class, args);
	}

}
