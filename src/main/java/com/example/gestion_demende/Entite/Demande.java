package com.example.gestion_demende.Entite;

import com.example.gestion_demende.Enum.Demande_Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Demande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Demande_id;
    private String name;
    private String prenom;
    private int age;
    private String tele;
    private String adresse;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Demande_date ;
    private String Description;
    @Enumerated(EnumType.STRING)
    private Demande_Status status ;
    public Demande(String name, String prenom, int age, String tele, String adresse, Date demande_date, String description, Demande_Status status) {
        this.name = name;
        this.prenom = prenom;
        this.age = age;
        this.tele = tele;
        this.adresse = adresse;
        this.Demande_date = demande_date;
        this.Description = description;
        this.status = status;
    }
}

