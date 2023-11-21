package com.project.coches.domain.service;

import com.project.coches.domain.pojo.BrandCarPojo;

import java.util.List;
import java.util.Optional;

public interface IBrandCarService {
    /**
     * Devuelve todas las marcas de coche
     * @return Lista de marcas de coche
     */

    List<BrandCarPojo> getAll();

    /**
     * Optional es usado para un manejo de nulls
     *
     * Devuelve una marca de coche dada su id
     * @param id Id de la marca de coche
     * @return Optional del marca coche encontrado
     */
    Optional<BrandCarPojo> getBrandCar(Integer id);


    /**
     * Guarda una marca de coche
     * @param newBrandCarPojo Id de la marca de coche
     * @return marca de coche guardada
     */
    BrandCarPojo save(BrandCarPojo newBrandCarPojo);


    /**
     * Elimina una marca coche dado su id
     * @param  idBrandCar Id de la marca de coche a eliminar
     */
    boolean delete(Integer idBrandCar);
}
