package com.project.coches.domain.pojo;
//El pojo es la clase de texto plano comun y corriente en java
import lombok.Getter;
import lombok.Setter;
/*
* Pojo de marca coche
* */
@Getter
@Setter
public class BrandCarPojo {


    /*
     * Id de la marca coche
     * */
    private Integer id;

    /*
     * descripcion de la marca coche
     * */
    private String description;
}
