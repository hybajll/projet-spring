package com.example.demo.controller;

import com.example.demo.entities.Etudiant;
import com.example.demo.service.IEtudiantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantRestController {
    private final IEtudiantService etudiantService;

    public EtudiantRestController(IEtudiantService etudiantService) { this.etudiantService = etudiantService; }

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() { return etudiantService.retrieveAllEtudiants(); }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long id) { return etudiantService.retrieveEtudiant(id); }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) { return etudiantService.addEtudiant(etudiant); }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long id) { etudiantService.removeEtudiant(id); }

    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant etudiant) { return etudiantService.modifyEtudiant(etudiant); }
}
