package com.JP.ias.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.JP.ias.model.TontAvesModel;
import com.JP.ias.service.AvesService;
import com.JP.ias.util.QueryResult;
import com.JP.ias.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/aves")
public class AvesController {
	
	
	
	/**
	 * Constantes de mensajes de respuesta
	 */
	private static final String ERROR_GUARDAR = "Los campos obligatorios no se encuentran diligenciados.";
	private static final String EXITO_GUARDAR = "Exito al guardar los campos.";
	private static final String ERROR_ELIMINAR = "No ha sido posible eliminar el elemento.";
	private static final String EXITO_ELIMINAR = "Exito al eliminar el elemento.";
	
	@Autowired
	@Qualifier("avesServiceImpl")
	private AvesService avesService;
	
	
	/**
	 * Metodo get para listar todos los objetos aves
	 * @param aveJson
	 * @return
	 */
	@GetMapping("/listAllAves")
	public List<TontAvesModel> listAllAves() {
		
		return avesService.listAllAves();
	}
	
	/**
	 * Metodo post para guardar un objeto ave
	 * @param aveJson
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@PostMapping("/saveOrUpdateAve")
	public RestResponse saveOrUpdateAve(@RequestBody String aveJson) throws JsonParseException, JsonMappingException, IOException {
				
		TontAvesModel tontAvesModel = new ObjectMapper().readValue(aveJson, TontAvesModel.class);
		
		if (! validarObejetoAve(tontAvesModel)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),ERROR_GUARDAR);
			
		}
		
		avesService.addAve(tontAvesModel);
		
		return new RestResponse(HttpStatus.OK.value(),EXITO_GUARDAR);		
		
	}
	
	
	
	/**
	 * Metodo Post para eliminar un objeto ave
	 * @param aveJson
	 * @throws Exception
	 */
	@PostMapping("/deleteAve")
	public RestResponse deleteAve(@RequestBody String aveJson) throws Exception {
		
		TontAvesModel tontAvesModel = new ObjectMapper().readValue(aveJson, TontAvesModel.class);
		
		if (tontAvesModel.getCdAve() == null) {
			
			throw new Exception(ERROR_ELIMINAR);			
		}
		
		avesService.deleteAve(tontAvesModel);
		
		return new RestResponse(HttpStatus.OK.value(),EXITO_ELIMINAR);
		
		
	}
	
	
//	 /**
//	  * Metodo de busqueda por parametros nombre y zona
//	 * @param nombre
//	 * @param zona
//	 * @return
//	 */
//	@GetMapping("/findbynameandzona")
//	 public List<TontAvesModel> findByNombreAndZona(@RequestParam(name="nm",required = false, defaultValue="NULL")String nombre,
//			 @RequestParam(name="zn",required = false, defaultValue="NULL")String zona){
//	        return avesService.findByNombreAndZona(nombre, zona);
//	 }
	
	/**
	 * Metodo empleado para validación simple los campos requeridos del objeto ave
	 * @param tontAvesModel
	 * @return
	 */
	private boolean validarObejetoAve(TontAvesModel tontAvesModel) {
		
		boolean valid = true;
		
		if (tontAvesModel.getDsNombreCientifico().isEmpty() || tontAvesModel.getDsNombreCientifico() == null) {
			
			valid= false;
		}
		
		if (tontAvesModel.getDsNombreComun().isEmpty() || tontAvesModel.getDsNombreComun() == null) {
			
			valid= false;
		}
		
		return valid;
		
		
	}

}
