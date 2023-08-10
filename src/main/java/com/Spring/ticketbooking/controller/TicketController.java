package com.Spring.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.ticketbooking.Service.TicketService;
import com.Spring.ticketbooking.model.Ticket;

/**
 * this is the controller class
 * @author Nilesh
 */

@RestController
@RequestMapping(value="/ticket")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	/**
	 * this method will return all tickets
	 * @return
	 */
	@GetMapping(value = "/all")
	public Iterable<Ticket> getAllTickets() {
		return ticketService.getAllTickets();
	}
	
	/**
	 * this method is used to create the tickets
	 * @param ticketobj
	 * @return
	 */
	@PostMapping(value = "/create")
	public Ticket createTicket( @RequestBody Ticket ticketobj) {
		return ticketService.createTicket(ticketobj);
	}
	
	/**
	 * this method is used to get the ticket on the basis of id
	 * @param ticketId
	 * @return
	 */
	@GetMapping(value="/{ticketId}")
	public Ticket getTicket( @PathVariable("ticketId") Integer ticketId) {
		return ticketService.getTicketById(ticketId);
	}
	
	/**
	 * this method is used to update ticket
	 * @param ticketId
	 * @param newEmail
	 * @return
	 */
	@PutMapping(value="/{ticketId}/{newEmail}")
	public Ticket updateTicket( @PathVariable("ticketId") Integer ticketId,
			                   @PathVariable("newEmail") String newEmail) {
		return ticketService.updateTicket(ticketId, newEmail);
	}
	
	/**
	 * this method is used to delete the ticket
	 * @param ticketId
	 */
	@DeleteMapping(value="/{ticketId}")
	public void deleteTicket( @PathVariable("ticketId") Integer ticketId) {
		ticketService.deleteTicket(ticketId);
	}

}
