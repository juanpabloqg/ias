package com.JP.ias.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.JP.ias.model.TontAvesModel;

@Repository("avesJpaRepository")
public interface AvesJpaRepository extends JpaRepository<TontAvesModel, Serializable> {
	

//	/**
//	 * Metodo usado para buscar objetos ave que cumpla con la zona y nombre
//	 * @param nombre
//	 * @param zona
//	 * @return
//	 */
//	@Query("SELECT a" + 
//			"FROM ias.tont_aves a" + 
//			"inner join ias.tont_aves_pais ap on (a.CDAVE = ap.CDAVE)" + 
//			"inner join ias.tont_paises p on (p.CDPAIS = ap.CDPAIS)" + 
//			"where (a.DSNOMBRE_COMUN like concat('%',?1,'%') or a.DSNOMBRE_CIENTIFICO like concat('%',?1,'%')" +
//			"and p.CDZONA = '?2'")	
//	List<TontAvesModel> findByNombreAndZona(String nombre,String zona);
	
	
	
	

}
