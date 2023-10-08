package com.example.happytails.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="pets")
public class Pets {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="name")
	String name;
	@Column(name="breed")
	String breed;
	@Column(name="shots")
	String shots;
	@Column(name="owner")
	String owner;
	@Column(name="address")
	String address;
	@Column(name="phone")
	String phone;
	@Column(name="email")
	String email;

	
	public Pets() {
		
	}
	
	public Pets(String name, String breed, String shots, String owner, String address, String phone, String email) {
		super();
		this.name=name;
		this.breed=breed;
		this.shots=shots;
		this.owner=owner;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getShots() {
		return shots;
	}

	public void setShots(String shots) {
		this.shots = shots;
	}
	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	


	@Override
	public String toString() {
		return "Pets [id=" + id + ", name=" + name + ", breed=" + breed + ", shots=" + shots + ", owner=" + owner
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}


}
