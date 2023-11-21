package com.project.coches.domain.service;

import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.domain.repository.IBrandCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio marca coche
 *
 */
@RequiredArgsConstructor
@Service
public class BrandCarService implements IBrandCarService{

    /**
     * Repositorio marca coche
     * @see IBrandCarRepository
     *
     */
    private final IBrandCarRepository iBrandCarRepository;


    /**
     * Devuelve todas las marcas de coches
     * @return lista de marcas de coches
     */
    @Override
    public List<BrandCarPojo> getAll() {
        return iBrandCarRepository.getAll();
    }

    /**
     * Devuelve una marca de coche dado su identificador
     * @param id identificador de la marca de coche
     * @return Optional con la marca de coche
     */
    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return iBrandCarRepository.getBrandCar(id);
    }

    /**
     * Guarda una marca de coche
     * @param newBrandCarPojo marca de coche a guardar
     * @return marca de coche guardada
     */
    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCarPojo) {
        return iBrandCarRepository.save(newBrandCarPojo);
    }

/**
     * Elimina una marca de coche dado su identificador
     * @param idBrandCar identificador de la marca de coche a eliminar
     * @return true si se ha eliminado, false si no
     */

    @Override
    public boolean delete(Integer idBrandCar) {
        try{
            iBrandCarRepository.delete(idBrandCar);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
