package com.example.demo.controller;

import com.example.demo.entities.Universite;
import com.example.demo.service.IUniversiteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteRestController {
    private final IUniversiteService universiteService;

    public UniversiteRestController(IUniversiteService universiteService) { this.universiteService = universiteService; }

    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() { return universiteService.retrieveAllUniversites(); }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long id) { return universiteService.retrieveUniversite(id); }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite) { return universiteService.addUniversite(universite); }

    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long id) { universiteService.removeUniversite(id); }

    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite universite) { return universiteService.modifyUniversite(universite); }
}
