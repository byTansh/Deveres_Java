package br.com.senac.heroi.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.senac.heroi.model.Heroi;
import br.com.senac.heroi.repository.HeroiRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class SuperHeroiController {

    private HeroiRepository heroiRepository;

    public SuperHeroiController(HeroiRepository heroiRepository) {
        this.heroiRepository = heroiRepository;
    }

    @GetMapping("/heroi")
    public ResponseEntity<?> pesquisarHerois() {
        return new ResponseEntity<>(heroiRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/heroi/{id}")
    public ResponseEntity<?> pesquisarHeroiPorId(@PathVariable int id) {
        return new ResponseEntity<>(heroiRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/heroi")
    public ResponseEntity<?> salvarHerois(@RequestBody List<Heroi> entidades) {
        List<Heroi> cadastrosHerois;

        try {
            cadastrosHerois = heroiRepository.saveAll(entidades);
        } catch (Exception e) {
            return new ResponseEntity<String>("Erro ao cadastrar heróis", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<List<Heroi>>(cadastrosHerois, HttpStatus.OK);
    }

    @PutMapping("/heroi/{id}")
    public ResponseEntity<?> atualizarCadastroHeroi(@PathVariable int id,
            @RequestBody Heroi entity) {

        Optional<Heroi> atualizarCadastroHeroi = heroiRepository.findById(id);
        Heroi h = null;

        if (atualizarCadastroHeroi.isPresent()) {
            h = atualizarCadastroHeroi.get();

            h.setNome(entity.getNome());
            h.setApelido(entity.getApelido());
            h.setSuperPoder(entity.getSuperPoder());
            h.setFraqueza(entity.getApelido());
            h.setHistoriaOrigem(entity.getHistoriaOrigem());
            h.setPrimeiraAparicao(entity.getPrimeiraAparicao());

            try {
                h = heroiRepository.save(h);
            } catch (Exception e) {
                return new ResponseEntity<String>("Erro ao atualizar o cadastro do Heroi",
                        HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<Heroi>(h, HttpStatus.OK);

        } else {
            return new ResponseEntity<String>("Heroi nao encontrado",
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/heroi/{id}")
    public ResponseEntity<?> exluirCadastroHeroi(@PathVariable int id) {

        Optional<Heroi> heroiExcluir = heroiRepository.findById(id);
        Heroi h = null;

        if (heroiExcluir.isPresent()) {
            h = heroiExcluir.get();

            try {
                heroiRepository.delete(h);
            } catch (Exception e) {
                return new ResponseEntity<String>("Erro ao excluir o cadastro do Heroi",
                        HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<Heroi>(h, HttpStatus.OK);

        } else {
            return new ResponseEntity<String>("Heroi nao encontrado",
                    HttpStatus.BAD_REQUEST);
        }
    }

}