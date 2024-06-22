package com.tienda_vt.tienda.services.impl;

import com.tienda_vt.tienda.dao.CategoriaDao;
import com.tienda_vt.tienda.domain.Categorias;
import com.tienda_vt.tienda.services.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl
        implements CategoriaService {

    @Autowired
    private CategoriaDao CategoriaDao;

    @Override
    public List<Categorias> getCategorias(boolean activos) {
        var lista = CategoriaDao.findAll();
       
        if(activos){
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

}
