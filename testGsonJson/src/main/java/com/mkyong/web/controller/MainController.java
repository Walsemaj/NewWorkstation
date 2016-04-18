package com.mkyong.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mkyong.web.exception.CustomGenericException;

@Controller
public class MainController {

	@RequestMapping(value = "/home/{type:.+}", method = RequestMethod.GET)
	public String getPages(@PathVariable("type") String type, Model model, final RedirectAttributes redirectAttributes, HttpServletResponse response)
			throws Exception {

		if ("error".equals(type)) {
			// go handleCustomException
			throw new CustomGenericException("E888", "This is custom message");
		} else if ("io-error".equals(type)) {
			// go handleAllException
			throw new IOException();
		} else if ("object2JsonFormattedString".equals(type)) {
			model.addAttribute("msg", GsonObjToJsonFormmattedString.getJsonFormattedString());
			model.addAttribute("labelname", "readJsonFormattedStringFromServer");
			return "readJsonFormattedStringFromServer";
		} else if ("textFile2JsonFormattedString".equals(type)) {
			model.addAttribute("msg", GsonTextFileToJsonFormattedString.getJsonFormattedString());
			model.addAttribute("labelname", "readJsonFormattedStringFromServer");
			return "readJsonFormattedStringFromServer";
		} else if ("collectJsonFile".equals(type)) {
			return "readJsonFile";
		} else {
			model.addAttribute("msg", type);
			return "index";
		}

	}
	
	/*
	 * curl http://localhost:8080/testGsonJson/collect/
	 * {"data1":100,"data2":"hello","list":["String 1","String 2","String 3","String 4"]}
	 */
	@RequestMapping(value="/collect/", method=RequestMethod.GET)
	@ResponseBody
	public String getJsonFileOnTheFle()
			throws Exception {

			String temp = GsonTextFileToJsonFormattedString.getJsonFileContent();
			System.out.println(temp);
			return temp;
	}

	/*
	 * @ExceptionHandler(CustomGenericException.class) public ModelAndView
	 * handleCustomException(CustomGenericException ex) {
	 * 
	 * ModelAndView model = new ModelAndView("error/generic_error");
	 * model.addObject("errCode", ex.getErrCode()); model.addObject("errMsg",
	 * ex.getErrMsg());
	 * 
	 * return model;
	 * 
	 * }
	 * 
	 * @ExceptionHandler(Exception.class) public ModelAndView
	 * handleAllException(Exception ex) {
	 * 
	 * ModelAndView model = new ModelAndView("error/generic_error");
	 * model.addObject("errMsg", "this is Exception.class");
	 * 
	 * return model;
	 * 
	 * }
	 */

}