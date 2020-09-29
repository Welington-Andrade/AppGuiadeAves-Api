package br.com.infnet.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAve")
public class Ave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String especie;
	private boolean ameacada;
	
	public Ave() {
	}
	
	public Ave(Integer id, String nome, String especie, boolean ameacada) {
		this();
		this.setId(id);
		this.setNome(nome);
		this.setEspecie(especie);
		this.setAmeacada(ameacada);
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
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public boolean isAmeacada() {
		return ameacada;
	}
	
	public void setAmeacada(boolean ameacada) {
		this.ameacada = ameacada;
	}
	
}
