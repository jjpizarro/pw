package edu.unimagdalena.voteu.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unimagdalena.voteu.modelo.Candidato;
import edu.unimagdalena.voteu.repositorio.CandidatoRepository;

@Service
public class CandidatoServicesImp implements ICandidatoServices {
	
	@Autowired
	private CandidatoRepository cr;
	
	@Override
	public Candidato crearCandidato(Candidato c) {
		
		return cr.save(c);
	}

	@Override
	public Candidato actualizarCandidato(Candidato c) {
		return cr.save(c);
	}

	@Override
	public void eliminarCandidato(Candidato c) {
		cr.delete(c);

	}

	@Override
	public List<Candidato> buscarTodosCandidatos() {
		return cr.findAll();
	}

	@Override
	public Candidato buscarCandidatoPorId(Long id) {
		return cr.getOne(id);
	}

}
