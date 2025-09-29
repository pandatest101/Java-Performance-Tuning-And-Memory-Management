package com.art.warmup.jit.statements;

import com.art.warmup.jit.statements.config.StatementDataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StatementDataConfig.class)
public class StatementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatementsApplication.class, args);
	}

}
