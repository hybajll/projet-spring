package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    // L'étudiant est le fils -> mappedBy
    @ManyToMany(mappedBy = "etudiants")
    private Set<Reservation> reservations;
}