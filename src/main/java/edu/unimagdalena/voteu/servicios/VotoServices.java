package edu.unimagdalena.voteu.servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unimagdalena.voteu.modelo.Candidato;
import edu.unimagdalena.voteu.modelo.Estudiante;
import edu.unimagdalena.voteu.modelo.Voto;
import edu.unimagdalena.voteu.repositorio.VotoRepository;

@Service
public class VotoServices implements IVotoServices{
	@Autowired
	private VotoRepository vr;
	@Override
	public List<Voto> buscarVotoPorCandidato(Candidato candidato) {
		
		return vr.findVotoByCandidato(candidato);
	}

	@Override
	public Voto votar(Voto v) {
		if(v.getEstudiante() != null && v.getCandidato() != null) {
			return vr.save(v);
		}
		
		return null;
	}

}
