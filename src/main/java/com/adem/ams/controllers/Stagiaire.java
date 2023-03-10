package com.adem.ams.controllers;

public class Stagiaire
{
	private static double PI = 3.14; // Testing static
	public static void info () {System.out.println(PI + PI);}; // Testing static
	
	private String nom;
	private int age;
	private String adresse;
	private int tel;

	public Stagiaire() {}

	public Stagiaire(String nom, int age, String adresse, int tel)
	{
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.tel = tel;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getAdresse()
	{
		return adresse;
	}

	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
	}

	public int getTel()
	{
		return tel;
	}

	public void setTel(int tel)
	{
		this.tel = tel;
	}

	@Override
	public String toString()
	{
		return "Stagiaire [nom=" + nom + ", age=" + age 
				+ ", adresse=" + adresse + ", tel=" + tel + "]";
	}
}
