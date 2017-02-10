package com.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ticket.dao.LoginDao;
import com.ticket.exception.PersistenceException;
import com.ticket.exception.ServiceException;
import com.ticket.exception.ValidatorException;
import com.ticket.service.EmployeeService;
@Controller
@RequestMapping("/employee")

public class EmployeeController {
	EmployeeService employeeService = new EmployeeService();
	
	private 	LoginDao employeeDao=new LoginDao();

	@GetMapping("/signup")
	public String save(@RequestParam("name") String name, 
			@RequestParam("emailId") String emailid,@RequestParam("password") String password,
			@RequestParam("departmentId") int departmentId,@RequestParam("roleId") int roleId) {
			try {
				employeeService.registration(name,emailid,password,departmentId,roleId);
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
		if(employeeDao.employeelogin(emailId, password)){
			return "../EmployeeTicket.jsp";
		}
		else{
			return "/";

		}}
		
		


}
