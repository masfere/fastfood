package mafe.dev.fastfood.domain.repository;

import java.util.List;
import mafe.dev.fastfood.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNome(String nome);
    List<Produto> findByNomeContainingIgnoreCase(String nome);
    List<Produto> findByCategoriaContainingIgnoreCase(String categoria);

    public List<Produto> findByCategoria(String categoria);

}