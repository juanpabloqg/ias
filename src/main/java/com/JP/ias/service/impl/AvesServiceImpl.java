package com.JP.ias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.JP.ias.model.TontAvesModel;
import com.JP.ias.repository.AvesJpaRepository;
import com.JP.ias.service.AvesService;


@Service("avesServiceImpl")
public class AvesServiceImpl implements AvesService {
	
	/**
	 * Inyeccion de dependicia de repositorio
	 */
	@Autowired
	@Qualifier("avesJpaRepository")
	private AvesJpaRepository avesJpaRepository;

	@Override
	public List<TontAvesModel> listAllAves() {
		
		return avesJpaRepository.findAll();
	}

	@Override
	public TontAvesModel addAve(TontAvesModel tontAvesModel) {
		
		return avesJpaRepository.save(tontAvesModel);
	}

	@Override
	public int deleteAve(TontAvesModel tontAvesModel) {
		avesJpaRepository.delete(tontAvesModel);
		return 0;
	}

	@Override
	public TontAvesModel updateAve(TontAvesModel tontAvesModel) {
		
		return avesJpaRepository.save(tontAvesModel);
	}

//	@Override
//	public List<TontAvesModel> findByNombreAndZona(String nombre, String zona) {
//		
//		return avesJpaRepository.findByNombreAndZona(nombre, zona);
//	}



}
