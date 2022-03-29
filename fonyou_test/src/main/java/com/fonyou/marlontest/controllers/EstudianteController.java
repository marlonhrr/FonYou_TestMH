package com.fonyou.marlontest.controllers;

import com.fonyou.marlontest.domains.asignaciones.ExamenEstudiante;
import com.fonyou.marlontest.domains.asignaciones.ExamenEstudiantePreguntas;
import com.fonyou.marlontest.domains.maestros.Estudiante;
import com.fonyou.marlontest.domains.util.GenericResponse;
import com.fonyou.marlontest.services.EstudianteService;
import com.fonyou.marlontest.services.ExamenEstudianteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    private EstudianteService estudianteService;
    private ExamenEstudianteService examenEstudianteService;

    public EstudianteController(EstudianteService estudianteService, ExamenEstudianteService examenEstudianteService) {
        this.estudianteService = estudianteService;
        this.examenEstudianteService = examenEstudianteService;
    }

    /**
     * Recurso encargado de creear un estudiante.
     * @return
     */
    @PostMapping("/createEstudiante")
    public ResponseEntity<GenericResponse> createEstudiante(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(
                new GenericResponse(
                        HttpStatus.OK,
                        null,
                        estudianteService.createEstudiante(estudiante)
                )
        );
    }

    /**
     * Recurso que retorna la lista de estudiantes matriculados
     *
     * @return
     */
    @GetMapping("/findAllEstudiantes")
    public ResponseEntity<List<Estudiante>> findAllEstudiantes() {
        return ResponseEntity.ok(estudianteService.findAllEstudiantes());
    }

    /**
     * Recurso encargado de asignar un examen a un estudiante!
     *
     * @return
     */
    @PostMapping("/assignExamenToEstudiante")
    public ResponseEntity<GenericResponse> assignExamenToEstudiante(@RequestBody ExamenEstudiante examenEstudiante) {
        return ResponseEntity.ok(
                new GenericResponse(
                        HttpStatus.OK,
                        "Se ha asignado el examen correctamente!",
                        examenEstudianteService.assignExamenToEstudiante(examenEstudiante)
                )
        );
    }

    /**
     * @param examenEstudiantePreguntasList
     * @param examenEstudianteId
     * @return
     */
    @PostMapping("/answerExamen")
    ResponseEntity<GenericResponse> answerExamen(@RequestParam Long examenEstudianteId,
                                                 @RequestBody List<ExamenEstudiantePreguntas> examenEstudiantePreguntasList) {
        ExamenEstudiante examenEstudiante;
        try {
            examenEstudiante = examenEstudianteService.answerExamen(examenEstudianteId, examenEstudiantePreguntasList);
            return ResponseEntity.ok(
                    new GenericResponse(
                            HttpStatus.OK,
                            "la calificación final de su examen es: " + examenEstudiante.getCalificacion(),
                            examenEstudiante));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(
                    new GenericResponse(HttpStatus.BAD_REQUEST, e.getMessage(), null));
        }
    }
}
