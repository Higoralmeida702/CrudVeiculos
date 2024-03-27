package com.higor.CrudVeiculos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.CrudVeiculos.Entities.Veiculos;

public interface VeiculosRepository extends JpaRepository <Veiculos, Long>{

}
