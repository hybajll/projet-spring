package com.example.demo.controller;

import com.example.demo.entities.Bloc;
import com.example.demo.service.IBlocService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocRestController {
    private final IBlocService blocService;

    public BlocRestController(IBlocService blocService) { this.blocService = blocService; }

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() { return blocService.retrieveAllBlocs(); }

    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long id) { return blocService.retrieveBloc(id); }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc bloc) { return blocService.addBloc(bloc); }

    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long id) { blocService.removeBloc(id); }

    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc bloc) { return blocService.modifyBloc(bloc); }
}
