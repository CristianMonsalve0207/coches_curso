package com.project.coches.persistance.entity.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/*
* Mapper qie transforma objetos de Marcacohe a pojo o entidades
* */
@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaCocheEntity Entidad a transformar
     * @return pojo convertido
     */

    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCochePojo toMarcaCochePojo (MarcaCocheEntity marcaCocheEntity);

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaCochePojo Pojo a transformar
     * @return entity convertido
     * InheritInverseConfiguration es:  La inversa de lo que tengo arriba
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity (MarcaCochePojo marcaCochePojo);


    /**
     * Convierte una lista de marcas coche transofrmada a pojo de una lista de entidades
     * @param marcasCocheEntityList entidad a transformar
     * @return Lista transformada
     */
    List <MarcaCochePojo> toMarcaCochePojo (List <MarcaCocheEntity> marcasCocheEntityList);

}
