package br.com.senac.heroi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.heroi.model.Heroi;

public interface HeroiRepository extends JpaRepository<Heroi, Integer> {

}
