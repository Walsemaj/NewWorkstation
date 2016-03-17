package com.kb.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.kb.model.Customer;

@Controller
public class RegistrationController {
	
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	    public String viewRegistrationPage(@Valid Customer customer, Model model) {
		 System.out.println("viewRegistrationPage() customer email: " + customer.getEmailId());
	     if(customer == null) 
	    	 customer = new Customer();
	     
	        model.addAttribute("customer", customer);
	        return "register";
	    }

	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	    public String viewRegistrationPagePost(@Valid Customer customer, Model model, RedirectAttributes redirectAttributes, HttpServletRequest request) {
		 System.out.println("viewRegistrationPage() customer email POST: " + customer.getEmailId());
		 System.out.println("viewRegistrationPage() customer email POST: " + ((Customer)(model.asMap().get("customer"))).getEmailId());
		 	 
	     	redirectAttributes.addFlashAttribute("customerEmail", customer.getEmailId());
	        return "redirect:/home";
	    }
	 
	 @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
	    public String doLogin(@Valid Customer customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
//		 model.addAttribute("customer",customer);
	      //Do the Registration logic and then redirect to home page without using action for home page
		 
		 System.out.println("customer model email: " + customer.getEmailId());

		 redirectAttributes.addFlashAttribute("customer", customer);

	      return "forward:/register";

	    }

}
