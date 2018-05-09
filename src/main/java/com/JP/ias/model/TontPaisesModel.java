package com.JP.ias.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tont_paises")
public class TontPaisesModel {
	
	@Id
	@Column(name = "CDPAIS" , nullable = false , length = 3)
	private String cdPAis;
	
	@Column(name = "DSNOMBRE" , length = 100)
	private String dsNombre;
	
	@ManyToOne
	private TontZonasModel tontZonas;

	public TontPaisesModel() {
		
	}

	public TontPaisesModel(String cdPAis, String dsNombre, TontZonasModel tontZonas) {
		super();
		this.cdPAis = cdPAis;
		this.dsNombre = dsNombre;
		this.tontZonas = tontZonas;
	}

	public String getCdPAis() {
		return cdPAis;
	}

	public void setCdPAis(String cdPAis) {
		this.cdPAis = cdPAis;
	}

	public String getDsNombre() {
		return dsNombre;
	}

	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}

	public TontZonasModel getTontZonas() {
		return tontZonas;
	}

	public void setTontZonas(TontZonasModel tontZonas) {
		this.tontZonas = tontZonas;
	}
	
	

	
	
	
	
	
	
	

}
