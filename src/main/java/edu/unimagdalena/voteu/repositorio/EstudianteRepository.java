package edu.unimagdalena.voteu.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unimagdalena.voteu.modelo.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
