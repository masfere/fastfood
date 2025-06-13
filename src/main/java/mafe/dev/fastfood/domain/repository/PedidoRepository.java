/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mafe.dev.fastfood.domain.repository;

import java.util.List;
import mafe.dev.fastfood.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesidevb
 */
public interface PedidoRepository {
     package com.fastfood.repository;


    public List<Pedido> findAll();

    public Object findById(Long id);

    public Pedido save(Pedido pedido);

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus(StatusPedido status);
}

}
