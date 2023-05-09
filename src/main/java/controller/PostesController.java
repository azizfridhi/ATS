package controller;


import entities.postes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.PostesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/postes")
public class PostesController {

    @Autowired
    private PostesService posteService;

    @GetMapping
    public List<postes> getAllPostes() {
        return posteService.getAllPostes();
    }

    @GetMapping("/{id}")
    public Optional<postes> getPosteById(@PathVariable Long id) {
        return posteService.getPosteById(id);
    }

    @PostMapping
    public postes savePoste(@RequestBody postes poste) {
        return posteService.savePoste(poste);
    }

    @DeleteMapping("/{id}")
    public void deletePoste(@PathVariable Long id) {
        Optional<postes> poste = posteService.getPosteById(id);
        posteService.deletePoste(poste);
    }
}
