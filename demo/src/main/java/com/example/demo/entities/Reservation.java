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
public class Reservation implements Serializable {

    @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private Boolean estValide;

    @ManyToMany
    private Set<Etudiant> etudiants;
}