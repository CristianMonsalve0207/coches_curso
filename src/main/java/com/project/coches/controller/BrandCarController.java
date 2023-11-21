package com.project.coches.controller;

import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.domain.service.IBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 * Controlador rest de marcas de coches
 * Controller no tendria interfaz porque solo tendra las APIS
 * */

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marcas-coches")
public class BrandCarController {

    /**
     * Servicio marca coche
     * */
    private final IBrandCarService iBrandCarService;


    //Creacion ResponseEntity: Es una clase que nos permite devolver una respuesta HTTP este caso get 200
    @GetMapping
    public ResponseEntity<List<BrandCarPojo>> getAll(){
        return ResponseEntity.ok(iBrandCarService.getAll());
    }

    /**
     * of es un acortador va a validar dos cosas
     * 1º un not found si no existe el objeto
     * 2º si existe el objeto lo devuelve en un ok
     *
     * @PathVariable: Es para que coja el id de la url
     * */

    @GetMapping(path = "/{id}")
    public ResponseEntity <BrandCarPojo> getBrandCar(@PathVariable Integer id) {
        return ResponseEntity.of(iBrandCarService.getBrandCar(id));
    }

    @PostMapping
    public ResponseEntity<BrandCarPojo> save(@RequestBody BrandCarPojo newBrandCarPojo){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iBrandCarService.save(newBrandCarPojo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }




}
