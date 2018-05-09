package com.JP.ias.service;

import java.util.List;

import com.JP.ias.model.TontAvesModel;


public interface AvesService {
	
	/**Metodo para listar todas las aves
	 * @return
	 */
	public abstract List<TontAvesModel> listAllAves();
	
	/**
	 * Metodo para añadir un ave
	 * @param tontAvesModel
	 * @return
	 */
	public abstract TontAvesModel addAve(TontAvesModel tontAvesModel);
	
	/**
	 * Metodo para eliminar un ave
	 * @param tontAvesModel
	 * @return
	 */
	public abstract int deleteAve(TontAvesModel tontAvesModel);
	
	/**
	 * Metodo para actualizar un ave
	 * @param tontAvesModel
	 * @return
	 */
	public abstract TontAvesModel updateAve(TontAvesModel tontAvesModel);
	
//	/**
//	 * Metodo para encotrar un ave por nombre y zona
//	 * @param nombre
//	 * @param zona
//	 * @return
//	 */
//	public abstract List<TontAvesModel> findByNombreAndZona(String nombre, String zona);

}
