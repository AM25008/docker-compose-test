package com.firstAPI.productsAPI.service;



import com.firstAPI.productsAPI.dto.ProductoRequestDTO;
import com.firstAPI.productsAPI.dto.ProductoResponseDTO;

import java.util.List;

public interface IProductoService {
    ProductoResponseDTO crear(ProductoRequestDTO dto);
    ProductoResponseDTO obtenerPorId(Long id);
    List<ProductoResponseDTO> listarTodos();
    ProductoResponseDTO actualizar(Long id, ProductoRequestDTO dto);
    void eliminar(Long id);
}