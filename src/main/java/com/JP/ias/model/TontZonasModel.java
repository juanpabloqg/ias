package com.JP.ias.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tont_zonas")
public class TontZonasModel {
	
	@Id
	@Column(name = "CDZONA", nullable= false , length = 3)
	private String cdzona;
	
	@Column(name = "DSNOMBRE" , length = 45)
	private String dsnombre;

	public TontZonasModel() {
		
	}

	public TontZonasModel(String cdzona, String dsnombre) {
		
		this.cdzona = cdzona;
		this.dsnombre = dsnombre;
	}

	public String getCdzona() {
		return cdzona;
	}

	public void setCdzona(String cdzona) {
		this.cdzona = cdzona;
	}

	public String getDsnombre() {
		return dsnombre;
	}

	public void setDsnombre(String dsnombre) {
		this.dsnombre = dsnombre;
	}
	
	
	
	
	
	

}
