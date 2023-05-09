package repository;

import entities.postes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PosteRepository extends JpaRepository<postes, Long> {

    List<postes> findAll();

    Optional<postes> findById(Long id);

    postes save(postes poste);

    void delete(Optional<postes> poste);
}

