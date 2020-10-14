package edu.unimagdalena.voteu.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unimagdalena.voteu.modelo.Estudiante;
import edu.unimagdalena.voteu.repositorio.EstudianteRepository;

@Service
public class EstudianteServices implements IEstudianteServices {

	@Autowired
	EstudianteRepository sr;
	
	@Override
	public Estudiante crearEstudiante(Estudiante e) {
		return sr.save(e);
	}

	@Override
	public Estudiante buscarEstudiantePorId(Long id) {
		return sr.getOne(id);
	}

	@Override
	public Estudiante actualizarEstudiante(Estudiante e) {
		return sr.save(e);
	}

}
