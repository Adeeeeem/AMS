package com.adem.ams.entities;

//import static com.adem.ams.controllers.Stagiare.*;

public class Provider
{
	private int id;
	private String name;
	private String email;
	private String adresse;
	private String description;
	
	public Provider() {}
	
	public Provider(int id, String name, String email, String adresse, String description)
	{
		//System.out.println(PI);
		//info();
		this.id = id;
		this.name = name;
		this.email = email;
		this.adresse = adresse;
		this.description = description;
	}

	public int getId() {return id;}

	public void setId(int id) {this.id = id;}

	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}

	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;}

	public String getAdresse() {return adresse;}

	public void setAdresse(String adresse) {this.adresse = adresse;}

	public String getDescription() {return description;}

	public void setDescription(String description) {this.description = description;}

	@Override
	public String toString()
	{
		return "Provider [id=" + id + ", name=" + name + ", email=" + email + ", adresse=" + adresse + ", description="
				+ description + "]";
	}
}
