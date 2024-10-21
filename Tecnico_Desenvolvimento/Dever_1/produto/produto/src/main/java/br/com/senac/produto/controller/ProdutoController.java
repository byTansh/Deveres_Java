package br.com.senac.produto.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.senac.produto.model.Produto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ProdutoController {

    ArrayList<Produto> produtos = new ArrayList<Produto>(); 

    @GetMapping("/produto")    
    public ResponseEntity<?> getDadosProduto(@RequestParam int id) {        
        Optional<Produto> produtoPesquisado =  produtos
                                                .stream()
                                                .filter(produto -> produto.getId() == id)
                                                .findFirst();

        if (produtoPesquisado.isPresent()) {
            return new ResponseEntity<>(produtoPesquisado.get(), HttpStatus.OK); 
        }
                
        return new ResponseEntity<>("Produto nao encontrado!", HttpStatus.NOT_FOUND); 
    }


    @GetMapping("/produtos")    
    public ResponseEntity<?> getDadosProduto() {                
        return new ResponseEntity<>(produtos,HttpStatus.OK);
    }

    @PostMapping("/produto")
    @ResponseStatus(HttpStatus.CREATED)
    public String setNomeProduto(@RequestParam int id, 
                                 @RequestParam String nome, 
                                 @RequestParam String categoria,
                                 @RequestParam float preco) {
        Produto p = new Produto();
        p.setId(id);
        p.setNome(nome);
        p.setCategoria(categoria); 
        p.setPreco(preco);       
        //adicionei no array
        produtos.add(p);

        return "Produto cadastrado! Nome = " + p.getNome() + 
                ", categoria = " + p.getCategoria();    
    }    


    @PutMapping("/produto")
    public String alterarProduto(@RequestParam int id,
                                @RequestParam String nome,
                                @RequestParam String categoria,
                                @RequestParam float preco) {

        //pesquisar no array o produto 
        //com o ID == ao do parametro informado
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getId() == id) {
                p.setNome(nome);
                p.setCategoria(categoria);
                p.setPreco(preco);
                produtos.set(i, p);
                break;
            }
        }
        return "Produto alterado!";
    }


    @DeleteMapping("/produto")
    public ResponseEntity<?> deleteProduto(@RequestParam int id) {
        //pesquisar no array o produto
        //com o ID informado e entao excluir o produto
        boolean excluido = false;
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getId() == id) {
                produtos.remove(i);
                excluido = true;
                break;
            }
        }

        if (excluido) {
            return new ResponseEntity<>("Registro excluido",HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>("Registro nao encontrado",HttpStatus.NOT_FOUND);
    }


    @GetMapping("/produto/preco/maior")
    public String getMaiorPreco(@RequestParam float filtroPreco) {
        //float maiorPreco = 0 ;
        //String nomeProduto = "";
        ArrayList<Produto> maiores = new ArrayList<>();

        for (int index = 0; index < produtos.size(); index++) {
            Produto p = produtos.get(index);
            if (p.getPreco() > filtroPreco) {
                maiores.add(p);
            }
        }

        String resultado = "";
        for (int index = 0; index < maiores.size(); index++) {
            Produto p = maiores.get(index);
            resultado += "Nome produto: " + p.getNome() + 
                ", Preco produto: " + p.getPreco();
        }

        return resultado;
    }
    

    


}
