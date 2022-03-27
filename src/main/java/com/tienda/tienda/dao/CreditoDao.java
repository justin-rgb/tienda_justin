package com.tienda.tienda.dao;

import com.tienda.tienda.domain.Credito;
import org.springframework.data.repository.CrudRepository;

public interface CreditoDao extends CrudRepository<Credito, Long> {
    
}
