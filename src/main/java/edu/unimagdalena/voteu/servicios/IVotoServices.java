package edu.unimagdalena.voteu.servicios;

import java.util.Date;
import java.util.List;

import edu.unimagdalena.voteu.modelo.Candidato;
import edu.unimagdalena.voteu.modelo.Estudiante;
import edu.unimagdalena.voteu.modelo.Voto;

public interface IVotoServices {
	List<Voto> buscarVotoPorCandidato(Candidato candidato);
	Voto votar(Voto v );
	
}
