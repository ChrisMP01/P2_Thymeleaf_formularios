package com.christopher.inicial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorFormulario {

	@RequestMapping(value="form" ,method=RequestMethod.GET)
	public String hola_get() {
		
		return "datos";
	}
	
	@RequestMapping(value="formulario" ,method=RequestMethod.POST)
	public String hola_post (Model modelo,@RequestParam String nombre,@RequestParam String nacido,
			@RequestParam String hm) {
		
		modelo.addAttribute("nombre_form",nombre);
		modelo.addAttribute("nacido_form",nacido);
		modelo.addAttribute("hm_form",hm);
		return "resultados";
	}
	
}
