package com.christopher.inicial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorPeso {
	
	@RequestMapping(value="peso", method=RequestMethod.GET)
	public String peso_get(){
		return "datosPeso";
	}
	
	@RequestMapping(value="peso", method=RequestMethod.POST)
	public String peso_post(Model modelo,@RequestParam int edad,@RequestParam double peso,@RequestParam double altura,@RequestParam String hm) {
		double res=calcularPeso(edad,peso,altura,hm);
		modelo.addAttribute("res_form",res);
		return "pesoRes";
	}
	
	public double calcularPeso(int edad, double peso, double altura, String hm) {
		double imc=0,mg=0;
		double age=edad;
		//Índice de Masa Corporal
		imc=peso/(altura*altura);
		
		//Grasa corporal
		if(hm=="h") {
			mg=1.2*imc+0.23*age-10.8*1-5.4;
		}else if (hm=="m"){
			mg=1.2*imc+0.23*age-10.8*0-5.4;
		}
		return mg;
	}
}
