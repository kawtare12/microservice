package org.ENSAJ.ClientService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
public class Client {

    // annotation pour dire que l'attribut Id est une clé de la classe Client @Id
    // pour générer les valeurs d'Id automatiquement
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private Float age;
    
    

	public Client() {
		super();
	}



	public Client(Long id, String nom, Float age) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
	}
    
    
}
