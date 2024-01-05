package com.example.gestion_demende;

import com.example.gestion_demende.Entite.Demande;
import com.example.gestion_demende.Enum.Demande_Status;
import com.example.gestion_demende.Repository.DemandeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GestionDemendeApplication{

    public static void main(String[] args) {
        SpringApplication.run(GestionDemendeApplication.class, args);
    }
    CommandLineRunner start(DemandeRepository demandeRepository) {
        return args -> {
            Demande demande = new Demande("khira","leila",22,"0669884978","118 route de narbonne",new Date(),"une demande d'urgence pour Récupérer un colis pour une personne hospitalisée",Demande_Status.en_attente);
            Demande d = new Demande();
            d.setName("khira");
            d.setPrenom("ahmed");
            d.setAdresse("118 route de narbonne");
            d.setTele("0669884978");
            d.setAge(42);
            d.setStatus(Demande_Status.en_attente);
            d.setDemande_date(new Date());
            d.setDescription("une demande d'urgence pour Récupérer un colis pour une personne hospitalisée");
            // Vous pouvez également enregistrer les demandes séparément si nécessaire
            demandeRepository.save(demande);
            demandeRepository.save(d);
        };
    }

}
