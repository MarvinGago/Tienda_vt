package com.tienda_vt.tienda.services;

import com.tienda_vt.tienda.domain.Categorias;
import java.util.List;

public interface CategoriaService {
//se obtiene un listadpo de registro de la tabla categorias
//en array list de objetos Categoria
//todos o solo los activos...   
    public List<Categorias> getCategorias(boolean activos);
}
