package com.example.demo.service;

import com.example.demo.entities.Universite;
import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversite(Long id);
    Universite addUniversite(Universite universite);
    void removeUniversite(Long id);
    Universite modifyUniversite(Universite universite);
}
