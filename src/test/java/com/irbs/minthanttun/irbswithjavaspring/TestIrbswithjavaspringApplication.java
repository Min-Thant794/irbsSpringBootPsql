package com.irbs.minthanttun.irbswithjavaspring;

import org.springframework.boot.SpringApplication;

public class TestIrbswithjavaspringApplication {

	public static void main(String[] args) {
		SpringApplication.from(IrbswithjavaspringApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
