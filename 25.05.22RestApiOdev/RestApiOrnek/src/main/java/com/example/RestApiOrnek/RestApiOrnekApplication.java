package com.example.RestApiOrnek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class RestApiOrnekApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiOrnekApplication.class, args);
		
		
		
	}
	
	
	@RestController
	public static class Merhaba{
		@GetMapping("/merhaba")
		public String merhaba() {
			return "merhaba";
		}
	}

}
