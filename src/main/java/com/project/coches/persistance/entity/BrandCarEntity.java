package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Como es una entidad de la base de datos, va en el paquete de persistencia
// Entidad de la tabla MarcaCoche

/*
 * Entidad de la marca coche
 * */
@Entity

//ese es el nombre de la entidad en la base dd datos
@Table(name = "marca_coche")
public class BrandCarEntity {

    //Los tipos de datos en entidades solo se puede usar los wrappers ejem: Integer

    @Id //Le decimos que es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Le decimos que es autoincremental el id
    private Integer id;

    @Column(name = "descripcion")
    private String description;
}
