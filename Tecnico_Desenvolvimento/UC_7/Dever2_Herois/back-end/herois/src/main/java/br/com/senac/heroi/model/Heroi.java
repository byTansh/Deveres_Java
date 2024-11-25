package br.com.senac.heroi.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "super_heroi")
public class Heroi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column 
    private String apelido;

    @Column 
    private String superPoder;

    @Column
    private String fraqueza;

    @Column
    private String historiaOrigem;

    @Column 
    private Date primeiraAparicao;

    @ManyToOne
    @JoinColumn (name = "equipe_id", referencedColumnName = "id")
    private Equipe equipe;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSuperPoder() {
        return superPoder;
    }
    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

    public String getFraqueza() {
        return fraqueza;
    }
    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public String getHistoriaOrigem() {
        return historiaOrigem;
    }
    public void setHistoriaOrigem(String historiaOrigem) {
        this.historiaOrigem = historiaOrigem;
    }

    public Date getPrimeiraAparicao() {
        return primeiraAparicao;
    }
    public void setPrimeiraAparicao(Date primeiraAparicao) {
        this.primeiraAparicao = primeiraAparicao;
    }

    public Equipe getEquipe() {
        return this.equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

}
