package com.project.coches.persistance.repository;

import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.domain.repository.IBrandCarRepository;
import com.project.coches.persistance.entity.BrandCarEntity;
import com.project.coches.persistance.mapper.IBrandCarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Aqui usamos la anotacion @Repository para indicar que es un repositorio
//Ademas llamamos a la interfaz IBrandCarRepository del dominio

@RequiredArgsConstructor //Creara un constructor con los atributos finales
@Repository
public class BrandCarRepository implements IBrandCarRepository {

    //Para poder implementar los metodos necesito el repository y el mapper

    /**
     * Crud marca coche
     */

    private final IBrandCarCrudRepository iBrandCarCrudRepository;

    /**
     * Mapper marca coche
     */
    private final IBrandCarMapper iBrandCarMapper;


    //Para no deepender de idetidades llamamos al mapper
    /**
     * Devuelve todas las marcas de coche
     * @return Lista de marcas de coche
     */

    @Override
    public List<BrandCarPojo> getAll() {
        return iBrandCarMapper.toMarcaCochePojo(iBrandCarCrudRepository.findAll());
    }


    /**
     * Guarda una marca de coche
     * @param id Id de la marca de coche
     * @return marca de coche guardada
     */
    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return iBrandCarCrudRepository.findById(id)
                .map(iBrandCarMapper::toMarcaCochePojo);

        //iBrandCarMapper::toMarcaCochePojo metodo por referencia
    }


    /**
     * Guarda una marca de coche
     * @param newBrandCarPojo Id de la marca de coche
     * @return marca de coche guardada
     */
    //Recibimos un pojo y lo convertimos en una entidad
    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCarPojo) {
        BrandCarEntity brandCarEntity = iBrandCarMapper.toMarcaCocheEntity(newBrandCarPojo);
        return iBrandCarMapper.toMarcaCochePojo(iBrandCarCrudRepository.save(brandCarEntity));

    }

    /**
     * Elimina las maecas del coche dado su id
     * @param  idBrandCar Id de la marca de coche a eliminar
     */

    @Override
    public void delete(Integer idBrandCar) {
        iBrandCarCrudRepository.deleteById(idBrandCar);
    }
}
