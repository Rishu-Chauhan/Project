package com.E_Ticket.E_Ticket_Booking.repo;

import com.E_Ticket.E_Ticket_Booking.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
