package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.persistance.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/*
* Mapper que transforma objetos de Marcacohe a pojo o entidades
* */
@Mapper(componentModel = "spring")
public interface IBrandCarMapper {

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaCocheEntity Entidad a transformar
     * @return pojo convertido
     */

    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    BrandCarPojo toMarcaCochePojo (BrandCarEntity marcaCocheEntity);

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaCochePojo Pojo a transformar
     * @return entity convertido
     * InheritInverseConfiguration es:  La inversa de lo que tengo arriba
     */
    @InheritInverseConfiguration
    BrandCarEntity toMarcaCocheEntity (BrandCarPojo marcaCochePojo);


    /**
     * Convierte una lista de marcas coche transofrmada a pojo de una lista de entidades
     * @param marcasCocheEntityList entidad a transformar
     * @return Lista transformada
     */
    List <BrandCarPojo> toMarcaCochePojo (List <BrandCarEntity> marcasCocheEntityList);

}
