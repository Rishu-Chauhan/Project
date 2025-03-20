package com.E_Ticket.E_Ticket_Booking.service;

import com.E_Ticket.E_Ticket_Booking.entity.Ticket;
import com.E_Ticket.E_Ticket_Booking.repo.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public void cancelTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
