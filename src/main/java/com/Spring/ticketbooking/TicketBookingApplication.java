package com.Spring.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Spring.ticketbooking.Service.TicketService;
import com.Spring.ticketbooking.model.Ticket;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner {
	
	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		Ticket ticketobj=new Ticket();
		ticketobj.setPassengerName("Nilesh");
		ticketobj.setEmail("nileshchavan102@gmail.com");
		ticketobj.setDestinationstation("Pune");
		ticketobj.setSourceStation("Mumbai");
		ticketobj.setTravelDate(new Date());
		ticketService.createTicket(ticketobj);
	}

}
