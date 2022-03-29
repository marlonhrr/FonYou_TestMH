package com.fonyou.marlontest.controllers;

import com.fonyou.marlontest.domains.maestros.Examen;
import com.fonyou.marlontest.domains.util.GenericResponse;
import com.fonyou.marlontest.services.ExamenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/examen")
public class ExamenController {

    private ExamenService examenService;

    public ExamenController(ExamenService examenService) {
        this.examenService = examenService;
    }

    /**
     * Método encargado de retornar todos los exámentes que hay en la aplicación.
     * @return
     */
    @GetMapping("/getAllExamenes")
    public ResponseEntity<List<Examen>> getAllExamenes(){
        return ResponseEntity.ok(examenService.getAllExamenes());
    }

    /**
     *
     * @return
     */
    @PostMapping("/saveExamen")
    public ResponseEntity<GenericResponse> saveExamen(@RequestBody Examen examen){
        Examen examenAux;
        try {
            examenAux = examenService.saveExamen(examen);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(
                    new GenericResponse(HttpStatus.BAD_REQUEST, e.getMessage()));
        }
        return ResponseEntity.ok(new GenericResponse(HttpStatus.OK, null, examenAux));
    }
}
