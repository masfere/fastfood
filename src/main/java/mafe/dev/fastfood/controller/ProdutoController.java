/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mafe.dev.fastfood.controller;

import java.util.List;
import mafe.dev.fastfood.domain.model.Produto;
import mafe.dev.fastfood.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repo;

    @GetMapping
    public List<Produto> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return repo.save(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return repo.save(produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @GetMapping("/cat/{categoria}")
    public List<Produto> porCategoria(@PathVariable String categoria) {
        return repo.findByCategoria(categoria);
    }
}
   

