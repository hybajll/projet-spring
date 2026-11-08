package com.example.demo.service;

import com.example.demo.entities.Bloc;
import com.example.demo.repositories.BlocRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BlocServiceImpl implements IBlocService {
    private final BlocRepository blocRepository;

    public BlocServiceImpl(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

    @Override public List<Bloc> retrieveAllBlocs() { return blocRepository.findAll(); }
    @Override public Bloc retrieveBloc(Long id) {
        return blocRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Bloc introuvable : " + id));
    }
    @Override public Bloc addBloc(Bloc bloc) { return blocRepository.save(bloc); }
    @Override public void removeBloc(Long id) { blocRepository.deleteById(id); }
    @Override public Bloc modifyBloc(Bloc bloc) { return blocRepository.save(bloc); }
}
