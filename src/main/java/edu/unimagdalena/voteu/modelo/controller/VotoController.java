package edu.unimagdalena.voteu.modelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unimagdalena.voteu.modelo.Candidato;
import edu.unimagdalena.voteu.servicios.ICandidatoServices;
import edu.unimagdalena.voteu.servicios.IVotoServices;

/*http://localhost:8080/voto/...*/
@RestController
@RequestMapping("/voto")
public class VotoController {
	@Autowired
	private IVotoServices votoService;
	@Autowired
	private ICandidatoServices cantidatoService;
	/*get http://localhost:8080/voto/candidatos*/
	@GetMapping("/candidatos")
	public List<Candidato> consultarCandidatos(){
		return cantidatoService.buscarTodosCandidatos();
	}
	
}
