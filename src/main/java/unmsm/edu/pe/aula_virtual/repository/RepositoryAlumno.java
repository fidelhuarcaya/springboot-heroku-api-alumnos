package unmsm.edu.pe.aula_virtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unmsm.edu.pe.aula_virtual.model.Alumno;

@Repository
public interface RepositoryAlumno extends JpaRepository<Alumno, Long> {
}
