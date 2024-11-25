package br.com.senac.heroi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.heroi.model.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {

}
