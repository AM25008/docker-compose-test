package com.firstAPI.productsAPI.dto;

import com.firstAPI.productsAPI.model.enums.Categoria;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductoRequestDTO {
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Integer stock;
    private Categoria categoria;
}