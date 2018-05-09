package com.JP.ias.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tont_aves")
public class TontAvesModel {
	
	@Id
	@Column(name = "CDAVE" , nullable = false , length = 5)
	private String cdAve;
	
	@Column(name = "DSNOMBRE_COMUN" , length = 100)
	private String dsNombreComun;
	
	@Column(name = "DSNOMBRE_CIENTIFICO" , length = 200)
	private String dsNombreCientifico;

	public TontAvesModel() {
		
	}

	public TontAvesModel(String cdAve, String dsNombreComun, String dsNombreCientifico) {
		
		this.cdAve = cdAve;
		this.dsNombreComun = dsNombreComun;
		this.dsNombreCientifico = dsNombreCientifico;
	}

	public String getCdAve() {
		return cdAve;
	}

	public void setCdAve(String cdAve) {
		this.cdAve = cdAve;
	}

	public String getDsNombreComun() {
		return dsNombreComun;
	}

	public void setDsNombreComun(String dsNombreComun) {
		this.dsNombreComun = dsNombreComun;
	}

	public String getDsNombreCientifico() {
		return dsNombreCientifico;
	}

	public void setDsNombreCientifico(String dsNombreCientifico) {
		this.dsNombreCientifico = dsNombreCientifico;
	}
	
	
	
	
	
	

}
