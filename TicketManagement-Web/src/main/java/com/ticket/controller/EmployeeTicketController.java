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
import com.ticket.service.EmployeeService;
@Controller
@RequestMapping("/employee")

public class EmployeeTicketController {
		private EmployeeService employeeService = new EmployeeService();

		@GetMapping("/ticketassign")
		public String ticketReassignment(@RequestParam("emailId") String emailId,@RequestParam("password") String password,
				@RequestParam("ticketId") int ticketId,@RequestParam("employeeId") int employeeId) {
				try {
					employeeService.ticketReassignment(emailId,password,ticketId,employeeId);
					return "/";

				} catch (ServiceException e) {
					e.printStackTrace();
				} catch (PersistenceException e) {
					e.printStackTrace();
				} 
			return "/";

		}
		@GetMapping("/updateticket")
		public String updateTicket(@RequestParam("emailId") String emailId,@RequestParam("password") String password,
				@RequestParam("ticketId") int ticketId,@RequestParam("status") String status) {
				try {
					employeeService.updateTicket(emailId,password,ticketId,status);
					return "/";

				} catch (ServiceException e) {
					e.printStackTrace();
				} catch (PersistenceException e) {
					e.printStackTrace();
				} 
			return "/";

		}
		@GetMapping("/updatesolution")
		public String updateSolution(@RequestParam("emailId") String emailId,@RequestParam("password") String password,
				@RequestParam("ticketId") int ticketId,@RequestParam("solutionText") String solutionText) {
				try {
					employeeService.updateSolution(emailId,password,ticketId,solutionText);
					return "/";

				} catch (ServiceException e) {
					e.printStackTrace();
				} catch (PersistenceException e) {
					e.printStackTrace();
				} 
			return "/";

		}
		@GetMapping("/showemployeeticket")
		public String showEmployeeTicket(@RequestParam("emailId") String emailId,@RequestParam("password") String password,ModelMap modelMap) throws ValidatorException {
				try {
					List<TicketDetail> list=employeeService.showEmployeeTicket(emailId,password);
					modelMap.addAttribute("EMPLOYEE_TICKET_LIST",list);
					return "../ShowEmployeeTicket.jsp"; 

				} catch (ServiceException e) {
					e.printStackTrace();
				} 
			return "/";

		}
		@GetMapping("/deleteticket")
		public String deleteTicket(@RequestParam("emailId") String emailId,@RequestParam("password") String password,
				@RequestParam("ticketId") int ticketId) {
				try {
					employeeService.deleteTicket(emailId,password,ticketId);
					return "/";
					
					

				} catch (ServiceException e) {
					e.printStackTrace();
				} catch (PersistenceException e) {
					e.printStackTrace();
				} 
			return "/";

		}

}
