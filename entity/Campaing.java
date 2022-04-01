package com.Samir.bvc.prueba.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a2censo_campaign")
public class Campaing implements Serializable {
	
	
	public long getId() {
		return idcampaign;
	}


	public void setId(Long id) {
		this.idcampaign = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getRequestedAmount() {
		return requestedAmount;
	}


	public void setRequestedAmount(double requestedAmount) {
		this.requestedAmount = requestedAmount;
	}


	public double getAdminRate() {
		return adminRate;
	}


	public void setAdminRate(double adminRate) {
		this.adminRate = adminRate;
	}


	private static final long serialVersionUID = -7174453593065314397L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcampaign;
	
	@Column(length = 200)
	private String name;
	
	@Column(name="amount",nullable=false)
	private double amount;
	
	private double requestedAmount;
	
	
	private double adminRate;
	
	
	
	
	
	

}
