package com.drafael.springboot.webflux.client.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Producto {

    @Getter @Setter
    private String id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private Double precio;

    @Getter @Setter
    private Date createAt;

    @Getter @Setter
    private String foto;

    @Getter @Setter
    private Categoria categoria;

}
