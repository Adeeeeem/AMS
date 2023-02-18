package com.adem.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.adem.ams.entities.Provider;

import static com.adem.ams.AmsApplication.providers;

@Controller
@RequestMapping("/provider")
public class ProviderController
{
	@GetMapping("/list")
	//@ResponseBody
	public String listProviders(Model model)
	{
		//System.out.println(providers);
		//return "ListProvider";
		model.addAttribute("providers", providers);
		return "provider/listProviders";
	}
	
	@GetMapping("/add")
	public String getAddProvider(Model model)
	{
		model.addAttribute("provider", new Provider());
		return "provider/addProvider";
	}
	
	@PostMapping("/add")
	//@ResponseBody
	public String saveProvider
	(
		//@RequestParam("id") int id,
		//@RequestParam("name") String name,
		//@RequestParam("email") String email,
		//@RequestParam("adresse") String adresse,
		//@RequestParam("description") String description
		Provider provider
	)
	{
		//Provider p = new Provider(id, name, email, adresse, description);
		providers.add(provider);
		return "redirect:list";
	}
	
	@GetMapping("/details/{id}")
	public String detailsProvider(Model model, @PathVariable("id") int id)
	{		
		for(Provider provider : providers)
		{
			if(provider.getId() == id)
			{
				model.addAttribute("provider", provider);
				break;
			}
		}
		
		return "provider/detailsProvider";
	}
	
	@GetMapping("/update/{id}")
	public String updateProvider(Model model, @PathVariable("id") int id)
	{
		for(Provider provider : providers)
		{
			if(provider.getId() == id)
			{
				model.addAttribute("provider", provider);
				break;
			}
		}
		
		return "provider/editProvider";
	}
	
	@PostMapping("/update")
	public String updateAndSaveProvider(Provider provider)
	{
		for(Provider pr : providers)
		{
			if(pr.getId() == provider.getId())
			{

				providers.set(providers.indexOf(pr), provider);
				break;
			}
		}
		
		return "redirect:/provider/list";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProvider(@PathVariable("id") int id)
	{
		for(Provider provider : providers)
		{
			if(provider.getId() == id)
			{
				providers.remove(provider);
				break;
			}
		}
		
		return "redirect:../list";
	}
}
