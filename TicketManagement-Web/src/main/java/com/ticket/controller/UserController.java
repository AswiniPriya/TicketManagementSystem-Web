package com.ticket.controller;

//import java.util.List;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ticket.dao.LoginDao;
import com.ticket.exception.PersistenceException;
import com.ticket.exception.ServiceException;
import com.ticket.exception.ValidatorException;
//import com.ticket.model.User;
import com.ticket.service.UserTicketService;

@Controller
@RequestMapping("/users")
public class UserController {
	//private User user = new User();

	private UserTicketService userTicketService = new UserTicketService();

	private LoginDao login= new LoginDao();

@GetMapping("/signup")
public String save(@RequestParam("name") String name, 
		@RequestParam("emailId") String emailid,@RequestParam("password") String password,@RequestParam("phonenumber") long phonenumber) {
		try {
			userTicketService.registration(name,emailid,password,phonenumber);
			return "/";

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (ValidatorException e) {
			e.printStackTrace();
			}

	return "redirect:/";

}
@GetMapping("/login")
public String login( @RequestParam("emailId") String emailId,@RequestParam("password") String password) {
	if(login.login(emailId,password)){
		return "../UserTicket.jsp";
	}
	else{
		return "redirect:/";

	}}
	
	


}
