package com.eventapp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "events_table")
public class Events {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "event_name", nullable = false, length = 100)
	@Size(min=3,max=50,message="event name must be in between 3 to 5o char")
	private String name;
	@Column(name = "event_location", nullable = false, length = 100)
	private String location;
	@Column(name = "event_price", nullable = false)
	private double price;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name = "event_discount", nullable = false)
	private double discount;
	@Column(name = "noOfTicketBooked", nullable = false)
	private Integer noOfTicket;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Integer getNoOfTicket() {
		return noOfTicket;
	}

	public void setNoOfTicket(Integer noOfTicket) {
		this.noOfTicket = noOfTicket;
	}

	public Events(String name, String location, double price, Date date, double discount, Integer noOfTicket) {
		this.name = name;
		this.location = location;
		this.price = price;
		this.date = date;
		this.discount = discount;
		this.noOfTicket = noOfTicket;
	}

	public Events() {
	}

}