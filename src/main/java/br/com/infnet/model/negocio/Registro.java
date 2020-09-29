package br.com.infnet.model.negocio;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRegistro")
public class Registro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String local;
	private LocalDateTime date;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idObservador")
	private Observador observador;
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s", 
					this.getId(),
					this.getLocal(),
					this.getDate()
				);
	}
	
	public Registro() {
	}
	
	public Registro(Integer id, String local, LocalDateTime date) {
		this();
		this.setId(id);
		this.setLocal(local);
		this.setDate(date);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
}
