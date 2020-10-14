package edu.unimagdalena.voteu.servicios;

import edu.unimagdalena.voteu.modelo.Estudiante;

public interface IEstudianteServices {
	Estudiante crearEstudiante(Estudiante e);
	Estudiante buscarEstudiantePorId(Long id);
	Estudiante actualizarEstudiante(Estudiante e);
}
