package unmsm.edu.pe.aula_virtual.service;

import org.springframework.http.ResponseEntity;
import unmsm.edu.pe.aula_virtual.model.Alumno;

import java.util.List;
import java.util.Optional;

public interface ServiceAlumno {
    Alumno insertAlumno(Alumno alumno);
    void deleteAlumno(Long id);
    List<Alumno> getAllAlumnos();
    Alumno updateAlumno(Alumno alumno);
    Optional<Alumno> getAlumno(Long id);

}
