package com.produits.oumaima.entities;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomCat;
	private String descriptionCat;
	@JsonIgnore
	@OneToMany(mappedBy = "categorie")
	private List<Produit> produits;
	public Categorie() {}
	public Categorie(String nomCat, String descriptionCat, List<Produit> produits) 
	{
	
	this.nomCat = nomCat;
	this.descriptionCat = descriptionCat;
	this.produits = produits;
	}
	
	public Categorie(String nomCat, String descriptionCat) {
		
		this.nomCat = nomCat;
		this.descriptionCat = descriptionCat;
	}
	public Long getIdCat() {
	return idCat;
	}
	public void setIdCat(Long idCat) {
	this.idCat = idCat;
	}
	public String getNomCat() {
	return nomCat;
	}
	public void setNomCat(String nomCat) {
	this.nomCat = nomCat;
	}
	public String getDescriptionCat() {
	return descriptionCat;
	}
	public void setDescriptionCat(String descriptionCat) {
	this.descriptionCat = descriptionCat;
	}
	public List<Produit> getProduits() {
	return produits;
	}
	public void setProduits(List<Produit> produits) {
	this.produits = produits;
	}

}
