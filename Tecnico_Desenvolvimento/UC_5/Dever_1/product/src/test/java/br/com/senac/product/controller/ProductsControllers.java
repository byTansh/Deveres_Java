package br.com.senac.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ProductsControllers {

    @GetMapping("/produto")
    public String getDataProduct(@RequestParam int id) {
        Produto p = new Produto();
    }

    @PostMapping""/pro
}
