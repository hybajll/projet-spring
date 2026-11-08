package com.example.demo.controller;

import com.example.demo.entities.Chambre;
import com.example.demo.service.IChambreService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreRestController {

    private final IChambreService chambreService;

    public ChambreRestController(IChambreService chambreService) {
        this.chambreService = chambreService;
    }

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        return chambreService.retrieveAllChambres();
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chambreId) {
        return chambreService.retrieveChambre(chambreId);
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chambreId) {
        chambreService.removeChambre(chambreId);
    }

    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre chambre) {
        return chambreService.modifyChambre(chambre);
    }
}
