package edu.unimagdalena.voteu.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="candidatos")
public class Candidato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String cedula;
	@Column
	private String foto;
	@Column(name="numero")
	private int nroCandidato;
	
	@OneToMany(mappedBy="candidato")
	
	private Set<Voto> voto;

	public Candidato() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Candidato(String nombre, String cedula, String foto, int nroCandidato) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.foto = foto;
		this.nroCandidato = nroCandidato;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getNroCandidato() {
		return nroCandidato;
	}

	public void setNroCandidato(int nroCandidato) {
		this.nroCandidato = nroCandidato;
	}

	public Set<Voto> getVoto() {
		return voto;
	}

	public void setVoto(Set<Voto> voto) {
		this.voto = voto;
	}
	
	
}
