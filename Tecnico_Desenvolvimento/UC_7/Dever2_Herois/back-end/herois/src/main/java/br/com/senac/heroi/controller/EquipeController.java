package br.com.senac.heroi.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.senac.heroi.model.Equipe;
import br.com.senac.heroi.repository.EquipeRepository;

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
public class EquipeController {

    private EquipeRepository equipeRepository;

    public EquipeController (EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    @GetMapping("/equipe")
    public ResponseEntity<?> pesquisarEquipes() {
        return new ResponseEntity<>(equipeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/equipe/{id}")
    public ResponseEntity<?> pesquisarEquipePorId(@PathVariable int id) {
        return new ResponseEntity<>(equipeRepository.findById(id), HttpStatus.OK);
    }
    
    @PostMapping("/equipe")
    public ResponseEntity<?> salvarEquipe(@RequestBody List<Equipe> salvarEquipes) {
        List<Equipe> cadastrosEquipes;

        try {
            cadastrosEquipes = equipeRepository.saveAll(salvarEquipes);
        } catch (Exception e) {
            return new ResponseEntity<String>("Erro ao cadastrar equipe", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<List<Equipe>>(cadastrosEquipes, HttpStatus.OK);
    }

    @PutMapping("/equipe/{id}")
    public ResponseEntity<?> atualizarCadastroEquipe(@PathVariable int id, 
                                        @RequestBody Equipe entity) {

        Optional<Equipe> atualizarCadastroEquipe = equipeRepository.findById(id);
        Equipe e = null;

        if (atualizarCadastroEquipe.isPresent()) {
            e = atualizarCadastroEquipe.get();

            e.setNome(entity.getNome());
            e.setDepartamento(entity.getDepartamento());

            try {
                e = equipeRepository.save(e);
            } catch (Exception ex) {
                return new ResponseEntity<String>("Erro ao atualizar o cadastro da equipe",
                        HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<Equipe>(e, HttpStatus.OK); 

        } else {
            return new ResponseEntity<String>("Equipe nao encontrada",                        
                        HttpStatus.BAD_REQUEST);
        }             
    }

    @DeleteMapping("/equipe/{id}")
    public ResponseEntity<?> exluirCadastroEquipe(@PathVariable int id) {

        Optional<Equipe> equipeExcluir = equipeRepository.findById(id);
        Equipe e = null;

        if (equipeExcluir.isPresent()) {
            e = equipeExcluir.get();
            
            try {
                equipeRepository.delete(e);
            } catch (Exception ex) {
                return new ResponseEntity<String>("Erro ao excluir o cadastro da equipe",
                        HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<Equipe>(e,HttpStatus.OK); 

        } else {
            return new ResponseEntity<String>("Equipe nao encontrada",                        
                        HttpStatus.BAD_REQUEST);
        } 
    }
    
}