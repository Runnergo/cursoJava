package com.cifo.myapp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(value = "card")
public class CardController {

	
		
	
	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String show ( HttpSession session) {
		
		
		if (session.getAttribute("cart") == null) {
			//System.out.println("Cart null");
			
		} else {
			
			List<Item> cart = (List<Item>) session.getAttribute("cart");		
			session.setAttribute("cart", cart);
		}
		
		String sid = session.getId();
		session.setAttribute("sid", sid);
		System.out.println("Session id: "+sid);
		
		return "/card/index";
	}
	
}
