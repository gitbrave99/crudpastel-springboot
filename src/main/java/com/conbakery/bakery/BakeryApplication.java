package com.conbakery.bakery;

import com.conbakery.bakery.model.Pastel;
import com.conbakery.bakery.repository.PastelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BakeryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BakeryApplication.class, args);
	}


	@Autowired
	private PastelRepository pastelRepository;


	@Override
	public void run(String... args) throws Exception {

	}


}
