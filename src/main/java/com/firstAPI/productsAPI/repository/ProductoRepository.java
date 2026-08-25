package com.firstAPI.productsAPI.repository;


import com.firstAPI.productsAPI.model.Producto;
import com.firstAPI.productsAPI.model.enums.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Spring Data JPA genera la implementación solo con el nombre del método
    List<Producto> findByCategoria(Categoria categoria);

    List<Producto> findByNombreContainingIgnoreCase(String nombre);

    boolean existsByNombre(String nombre);
}
