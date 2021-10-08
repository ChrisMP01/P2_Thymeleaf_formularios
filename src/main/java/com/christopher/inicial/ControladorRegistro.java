package com.christopher.inicial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorRegistro {
	
	@RequestMapping(value="registro" ,method=RequestMethod.GET)
	public String registro_get() {
		
		return "registrar";
	}
	
	@RequestMapping(value="registro" ,method=RequestMethod.POST)
	public String hola_post (Model modelo,@RequestParam String nombre,@RequestParam String apellido,
			@RequestParam String apellido2,@RequestParam String mail,@RequestParam String day,@RequestParam String month,
			@RequestParam String year,@RequestParam String password,@RequestParam String hm,@RequestParam String direccion,
			@RequestParam String estudios,@RequestParam(value="musica",required=false) String musica,
			@RequestParam(value="deportes",required=false) String deportes,@RequestParam(value="cine",required=false) String cine,
			@RequestParam(value="libros",required=false) String libros,@RequestParam(value="ciencia",required=false) String ciencia) {
			
			//Fieldset -> Datos registro
			modelo.addAttribute("nombre_form",nombre);
			modelo.addAttribute("apellido_form",apellido);
			modelo.addAttribute("apellido2_form",apellido2);
			modelo.addAttribute("mail_form",mail);
			modelo.addAttribute("day_form",day);
			modelo.addAttribute("month_form",month);
			modelo.addAttribute("year_form",year);
			modelo.addAttribute("password_form",password);
			modelo.addAttribute("hm_form",hm);
			modelo.addAttribute("direccion_form",direccion);
			
			//Fieldset -> Nivel de estudios e intereses
			modelo.addAttribute("estudios_form",estudios);
			modelo.addAttribute("musica_form",musica);
			modelo.addAttribute("deportes_form",deportes);
			modelo.addAttribute("cine_form",cine);
			modelo.addAttribute("libros_form",libros);
			modelo.addAttribute("ciencia_form",ciencia);
		return "registroRes";
	}
}
