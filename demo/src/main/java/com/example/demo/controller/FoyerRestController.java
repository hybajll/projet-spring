package com.example.demo.controller;

import com.example.demo.entities.Foyer;
import com.example.demo.service.IFoyerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerRestController {
    private final IFoyerService foyerService;

    public FoyerRestController(IFoyerService foyerService) { this.foyerService = foyerService; }

    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() { return foyerService.retrieveAllFoyers(); }

    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long id) { return foyerService.retrieveFoyer(id); }

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) { return foyerService.addFoyer(foyer); }

    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long id) { foyerService.removeFoyer(id); }

    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer foyer) { return foyerService.modifyFoyer(foyer); }
}
