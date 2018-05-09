package com.JP.ias.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tont_aves_pais")
public class TontAvePaisModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 239036352694598290L;


	@Id
	@ManyToOne	
	private TontPaisesModel cdPais;
	
	
	@Id
	@ManyToOne	
	private TontAvesModel cdAve;


	public TontAvePaisModel() {
		
	}


	public TontAvePaisModel(TontPaisesModel cdPais, TontAvesModel cdAve) {
		
		this.cdPais = cdPais;
		this.cdAve = cdAve;
	}


	public TontPaisesModel getCdPais() {
		return cdPais;
	}


	public void setCdPais(TontPaisesModel cdPais) {
		this.cdPais = cdPais;
	}


	public TontAvesModel getCdAve() {
		return cdAve;
	}


	public void setCdAve(TontAvesModel cdAve) {
		this.cdAve = cdAve;
	}
	
	
	
	
	
	

}
