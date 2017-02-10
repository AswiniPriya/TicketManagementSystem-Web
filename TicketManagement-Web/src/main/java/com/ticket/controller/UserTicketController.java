package com.ticket.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ticket.exception.PersistenceException;
import com.ticket.exception.ServiceException;
import com.ticket.exception.ValidatorException;
import com.ticket.model.TicketDetail;
import com.ticket.service.UserTicketService;
@Controller
@RequestMapping("/usersticket")
public class UserTicketController {
	private UserTicketService userTicketService = new UserTicketService();

	@GetMapping("/newticket")
	public String newticket(@RequestParam("emailId") String emailid,@RequestParam("password") String password,
			@RequestParam("subject") String subject,@RequestParam("description") String description,
			@RequestParam("departmentname") String departmentname,@RequestParam("priority") String priority) {
			try {
				userTicketService.newTicket(emailid,password,subject,description,departmentname,priority);
				return "";

			} catch (ServiceException e) {
				e.printStackTrace();
			} catch (PersistenceException e) {
				e.printStackTrace();
			} 
		return "redirect:/";

	}
	@GetMapping("/updateticket")
	public String ticketUpdate(@RequestParam("emailId") String emailid,@RequestParam("password") String password,
			@RequestParam("description") String description,@RequestParam("ticketid") int ticketid) {
			try {
				userTicketService.ticketUpdate(emailid,password,description,ticketid);
				return "";

			} catch (ServiceException e) {
				e.printStackTrace();
			} catch (PersistenceException e) {
				e.printStackTrace();
			} 
		return "redirect:/";

	}
	@GetMapping("/closeticket")
	public String ticketClose(@RequestParam("emailId") String emailid,@RequestParam("password") String password,
			@RequestParam("ticketid") int ticketid) {
			try {
				userTicketService.ticketClose(emailid,password,ticketid);
				return "";

			} catch (ServiceException e) {
				e.printStackTrace();
			} catch (PersistenceException e) {
				e.printStackTrace();
			} 
		return "redirect:/";

	}
	@GetMapping("/viewticket")
	public String viewTicket(@RequestParam("emailId") String emailid,@RequestParam("password") String password,ModelMap modelMap) {
			try {
				List<TicketDetail> list=userTicketService.viewTicket(emailid,password);
				modelMap.addAttribute("TICKET_LIST",list);
				return "../ViewUserTicket.jsp"; 

			} catch (ValidatorException e) {
				e.printStackTrace();
			}
		return "redirect:/";

	}

}
