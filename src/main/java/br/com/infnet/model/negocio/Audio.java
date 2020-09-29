package br.com.infnet.model.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TAudio")
public class Audio extends Registro{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idAve")
	private Ave ave;
	
	@Override
	public String toString() {
		return String.format("%d - %s", 
				this.id,
				this.ave.getNome()
				);
	}
	
	public Audio() {
	}
	
	public Audio(Integer id) {
		this();
		this.setId(id);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Ave getAve() {
		return ave;
	}
	
	public void setAve(Ave ave) {
		this.ave = ave;
	}
}
