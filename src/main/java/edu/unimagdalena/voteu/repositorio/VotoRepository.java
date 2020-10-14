package edu.unimagdalena.voteu.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.unimagdalena.voteu.modelo.Candidato;
import edu.unimagdalena.voteu.modelo.Voto;

public interface VotoRepository extends JpaRepository<Voto, Long> {
	@Query("SELECT v FROM Voto v "
			+ "WHERE v.fecha = :f AND v.hora = :h")
	List<Voto> buscarVotosPorFechaYHora(@Param("f") Date fecha,
			@Param("h") Date hora);

	List<Voto> findVotoByFechaAndHora(Date fecha, Date hora);
	
	List<Voto> findVotoByCandidato(Candidato c);
}
