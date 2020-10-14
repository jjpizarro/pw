package edu.unimagdalena.voteu.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unimagdalena.voteu.modelo.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

}
