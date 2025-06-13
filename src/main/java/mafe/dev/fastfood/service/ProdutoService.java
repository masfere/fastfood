/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mafe.dev.fastfood.service;

import java.util.List;
import java.util.Optional;
import mafe.dev.fastfood.domain.model.Produto;
import mafe.dev.fastfood.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepo;

    public boolean existsById(Long id) {
        return produtoRepo.existsById(id);
    }

    public Optional<Produto> findById(Long id) {
        return produtoRepo.findById(id);
    }

    public List<Produto> listarProdutos() {
        return (List<Produto>) produtoRepo.findAll();
    }

    public List<Produto> listByCategoria(String categoria) {
        return produtoRepo.findByCategoria(categoria);
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepo.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepo.deleteById(id);
    }

}
