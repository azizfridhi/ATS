package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entities.formulaire;

import java.util.List;
import java.util.Optional;

@Repository
public interface FormulaireRepository extends JpaRepository <formulaire, Long> {

    List<formulaire> findAll();

    Optional<formulaire> findById(Long id);

    formulaire save(formulaire poste);

    void delete(formulaire poste);
}
