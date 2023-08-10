package com.Spring.ticketbooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.ticketbooking.dao.TicketDao;
import com.Spring.ticketbooking.model.Ticket;
import java.util.logging.Logger;

/**
 * @author Nilesh
 */

@Service
public class TicketService {
    private static final Logger logger = Logger.getLogger(TicketService.class.getName());

	
	@Autowired
	private TicketDao ticketDao;
	
	/**
	 * this method will return all the tickets
	 * @return
	 */

	public Iterable<Ticket> getAllTickets() {
		logger.info("TicketService getAllTickets in:");
		return ticketDao.findAll();

	}
	
	/**
	 * this method is used to get the ticket by id
	 * @param ticketid
	 * @return
	 */
	public Ticket getTicketById(Integer ticketid) {
		return ticketDao.findById(ticketid).orElse(new Ticket());
	}
	
	/**
	 * this method is used to save the ticket in database
	 * @param ticketobj
	 * @return
	 */
	public Ticket createTicket(Ticket ticketobj) {
		return ticketDao.save(ticketobj);
	}
	
	/**
	 * this method is used to delete ticket
	 * @param ticketId
	 */
	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}
	
	public Ticket updateTicket(Integer ticketId,String newEmail) {
		Ticket dbticket=getTicketById(ticketId);
		dbticket.setEmail(newEmail);
		return ticketDao.save(dbticket);
	}
	

}
