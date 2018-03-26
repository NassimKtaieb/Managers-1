package persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import javax.resource.spi.AuthenticationMechanism;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	@GeneratedValue
	private Integer id;   
	@Id
	private Integer cin;
	private String nom;
	private String prenom;
	private int age;
	private Date datenaissance;
	private String adresse;
	private Integer tel;
	private Integer numcompte;
	private String typeuser;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Integer getCin() {
		return this.cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public Date getDatenaissance() {
		return this.datenaissance;
	}

	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}   
	public Integer getNumcompte() {
		return this.numcompte;
	}

	public void setNumcompte(Integer numcompte) {
		this.numcompte = numcompte;
	}   
	public String getTypeuser() {
		return this.typeuser;
	}

	public void setTypeuser(String typeuser) {
		this.typeuser = typeuser;
	}
   
}
