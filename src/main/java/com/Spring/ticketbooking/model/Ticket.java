package com.Spring.ticketbooking.model;

import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 
@Entity
@Table(name="Passenger_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticketId;
	@Column(name = "Passenger_name")
	private String passengerName;
	@Column(name = "sourceStation")
	private String sourceStation;
	@Column(name = "destination")
	private String destinationstation;
	@Column(name = "date")
	private Date travelDate;
	@Column(name = "email")
	private String email;

}
