package edu.unimagdalena.voteu.servicios;

import java.util.List;

import edu.unimagdalena.voteu.modelo.Candidato;

public interface ICandidatoServices {
	Candidato crearCandidato(Candidato c);
	Candidato actualizarCandidato(Candidato c);
	void eliminarCandidato(Candidato c);
	List<Candidato> buscarTodosCandidatos();
	Candidato buscarCandidatoPorId(Long id);
}
