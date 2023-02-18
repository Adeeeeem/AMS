package com.adem.ams.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("providerV1")
public class SimpleController
{
	@RequestMapping("/info")
	@ResponseBody
	public String info()
	{
		String formation = "Spring";
		int nbrHeures = 20;

		System.out.println("Hello BootCamp");
		return "<h4>Détails formation : " + formation + " " + nbrHeures + "</h4>";
		//return "info.html";
	}

	@RequestMapping("/data")
	public String data(Model model)
	{
		String trainer = "Mohamed Amine Mezghich";
		String adresse = "Tunis";

		model.addAttribute("trainer", trainer);
		model.addAttribute("adresse", adresse);
		
		List <String> names = new ArrayList <> ();
		
		names.add("Mohamed Adem Ben Moussa");
		names.add("Mohamed Ben Moussa");
		names.add("Adem Ben Moussa");
		names.add("Mohamed Adem");
		
		model.addAttribute("names", names);
		
		List <Stagiaire> stagiaires = new ArrayList <> ();
		
		Stagiaire S1 = new Stagiaire("Mohamed Adem Ben Moussa", 22, "Tunis", 25974632);
		Stagiaire S2 = new Stagiaire("Mohamed Ben Moussa", 56, "Ben Arous", 22649201);
		Stagiaire S3 = new Stagiaire("Adem Ben Moussa", 25, "Nabeul", 90825147);
		Stagiaire S4 = new Stagiaire("Mohamed Adem", 26, "Arianna", 58974361);
		
		stagiaires.add(S1);
		stagiaires.add(S2);
		stagiaires.add(S3);
		stagiaires.add(S4);
		
		//System.out.println(stagiaires);
		
		model.addAttribute("stagiaires", stagiaires);
		
		return "data.html";
	}
}
