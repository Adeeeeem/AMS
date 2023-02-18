package com.adem.ams;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adem.ams.entities.Provider;

@SpringBootApplication
public class AmsApplication
{
	public static List <Provider> providers = new ArrayList <> ();

	public static void main(String[] args)
	{
		Provider p1 = new Provider(1, "Nokia", "nokia@hotmail.fr", "China", "Vente Smart Phones");
		Provider p2 = new Provider(2, "Samsung", "samsung@gmail.com", "Korea", "Vente Smart Phones et TV");
		Provider p3 = new Provider(3, "HP", "hp@gmail.com", "USA", "Vente PC");
		
		providers.add(p1);
		providers.add(p2);
		providers.add(p3);

		SpringApplication.run(AmsApplication.class, args);

	}

}
