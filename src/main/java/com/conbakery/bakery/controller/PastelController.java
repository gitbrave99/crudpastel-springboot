package com.conbakery.bakery.controller;

import com.conbakery.bakery.exception.ResourceNotFoundException;
import com.conbakery.bakery.model.Pastel;
import com.conbakery.bakery.repository.PastelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// import javax.swing.text.html.parser.Entity;
import java.util.List;

// @CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/pastels")
public class PastelController {

    @Autowired
    private PastelRepository pastelRepository;

    @GetMapping
    public List<Pastel> getAllPastels(){
        return pastelRepository.findAll();
    }

    @PostMapping
    public Pastel createPastel(@RequestBody Pastel pastel){
        return pastelRepository.save(pastel);
    }

    @GetMapping("{idPastel}")
    public ResponseEntity<Pastel> getPastelById(@PathVariable int idPastel){
        Pastel cake= pastelRepository.findById(idPastel)
                .orElseThrow(() -> new ResourceNotFoundException("pastel not exists"));
        return ResponseEntity.ok(cake);
    }


    @PutMapping("{idPastel}")
    public ResponseEntity<Pastel> updatePastel(@PathVariable int idPastel,@RequestBody Pastel pastel){
        Pastel updateCake= pastelRepository.findById(idPastel)
                .orElseThrow(() -> new ResourceNotFoundException("pastel no "));

        updateCake.setNombre(pastel.getNombre());
        updateCake.setExistencia(pastel.getExistencia());

        pastelRepository.save(updateCake);

        return  ResponseEntity.ok(updateCake);

    }

    @DeleteMapping("{idPastel}")
    public ResponseEntity<HttpStatus>   deletePastel(@PathVariable int idPastel){
        Pastel pastelToDelete = pastelRepository.findById(idPastel)
                .orElseThrow(()-> new ResourceNotFoundException("cake does not exist"));

        pastelRepository.delete(pastelToDelete);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
