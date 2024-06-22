package com.tienda_vt.tienda.dao;

import com.tienda_vt.tienda.domain.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao
        extends JpaRepository<Categorias,Long> {

}
