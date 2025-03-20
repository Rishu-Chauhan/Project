package com.E_Ticket.E_Ticket_Booking.controller;

import com.E_Ticket.E_Ticket_Booking.entity.Ticket;
import com.E_Ticket.E_Ticket_Booking.service.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public String listTickets(Model model) {
        model.addAttribute("tickets", ticketService.getAllTickets());
        return "tickets";
    }

    @PostMapping("/book")
    public String bookTicket(@ModelAttribute Ticket ticket) {
        ticketService.bookTicket(ticket);
        return "redirect:/tickets";
    }

    @GetMapping("/cancel/{id}")
    public String cancelTicket(@PathVariable Long id) {
        ticketService.cancelTicket(id);
        return "redirect:/tickets";
    }
}
