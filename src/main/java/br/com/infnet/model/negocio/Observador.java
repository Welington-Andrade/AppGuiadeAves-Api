package br.com.infnet.model.negocio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TObservador")
public class Observador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer idade;
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name = "TResgistroAve",	
		joinColumns = {@JoinColumn(name="idRegistro")},
		inverseJoinColumns = {@JoinColumn(name="idAve")})
	private List<Registro> registros;
	
	
	public Observador() {
	}

	public Observador(Integer id, String nome, Integer idade) {
		this();
		this.setId(id);
		this.setNome(nome);
		this.setIdade(idade);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}	
	
}
