package br.com.infnet.model.negocio;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRegistro")
@Inheritance(strategy = InheritanceType.JOINED)
public class Registro{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String local;
	private LocalDateTime date;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idObservador")
	private Observador observador;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idAve")
	private Ave ave; 
	
	@Override
	public String toString() {
		return String.format("%d - %s- %s - %s", 
					this.getId(),
					this.getNome(),
					this.getLocal(),
					this.getDate()
				);
	}
	
	public Registro() {
	}

	public Registro(Integer id, String nome, String local, LocalDateTime date, Observador observador, Ave ave) {
		this();
		this.id = id;
		this.nome = nome;
		this.local = local;
		this.date = date;
		this.observador = observador;
		this.ave = ave;
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

	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Observador getObservador() {
		return observador;
	}

	public void setObservador(Observador observador) {
		this.observador = observador;
	}

	public Ave getAve() {
		return ave;
	}

	public void setAve(Ave ave) {
		this.ave = ave;
	}
	
}
