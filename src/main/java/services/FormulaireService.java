package services;

import entities.formulaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FormulaireRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FormulaireService {

    @Autowired
    private FormulaireRepository formulaireRepository;

    public List<formulaire> getAllformulaire() {
        return formulaireRepository.findAll();
    }

    public Optional<formulaire> getformulaireById(Long id) {
        return formulaireRepository.findById(id);
    }

    public formulaire saveformulaire(formulaire formulaire) {
        return formulaireRepository.save(formulaire);
    }

    public void deleteformulaire(formulaire formulaire) {
        formulaireRepository.delete(formulaire);
    }
}


