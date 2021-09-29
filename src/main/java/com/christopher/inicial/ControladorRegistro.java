package com.christopher.inicial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorRegistro {
	
	@RequestMapping(value="registro" ,method=RequestMethod.GET)
	public String registro_get() {
		
		return "registrar";
	}
}
