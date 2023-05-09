package services;


import entities.postes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PosteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostesService {

    @Autowired
    private PosteRepository posteRepository;

    public List<postes> getAllPostes() {
        return posteRepository.findAll();
    }

    public Optional<postes> getPosteById(Long id) {
        return posteRepository.findById(id);
    }

    public postes savePoste(postes poste) {
        return posteRepository.save(poste);
    }

    public void deletePoste(Optional<postes> poste) {
        posteRepository.delete(poste);
    }
}

