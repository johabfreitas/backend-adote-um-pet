package br.com.johabfreitas.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.johabfreitas.adoteumpet.core.models.Pet;
import br.com.johabfreitas.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

/**
 * A anotação @ Autowired fornece controle sobre onde e como a ligação entre os beans deve ser realizada. 
 * Pode ser usado para em métodos setter, no construtor, em uma propriedade ou 
 * métodos com nomes arbitrários e / ou vários argumentos.
 */

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Jack");
		pet.setHistoria("Historia emocionanete");
		pet.setFoto("https://petepop.ig.com.br/wp-content/uploads/2020/12/david-clarke-0h3Emf2YLKg-unsplash.jpg");
		petRepository.save(pet);
		
	}

}
