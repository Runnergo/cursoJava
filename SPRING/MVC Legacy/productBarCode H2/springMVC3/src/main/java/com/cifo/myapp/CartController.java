package com.cifo.myapp;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "cart")
public class CartController {

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "cart/index";
	}

	@RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
	public String buy(@PathVariable("id") String id, HttpSession session) {

		// ProductModel productModel = new ProductModel();

		if (session.getAttribute("cart") == null) {

			List<Item> cart = new ArrayList<Item>();
			cart.add(new Item(ProductDAO.getProductById(id), 1));
			session.setAttribute("cart", cart);

		} else {

			List<Item> cart = (List<Item>) session.getAttribute("cart");

			int index = this.exists(id, cart);
			if (index == -1) {
				cart.add(new Item(ProductDAO.getProductById(id), 1));
			} else {
				int quantity = cart.get(index).getQuantity() + 1;
				cart.get(index).setQuantity(quantity);
			}

			session.setAttribute("cart", cart);
		}

		String sid = session.getId();
		session.setAttribute("sid", sid);
		System.out.println("Session id: " + sid);

		return "redirect:/cart/index";
	}

	@RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
	public String remove(@PathVariable("id") String id, HttpSession session) {

		//ProductModel productModel = new ProductModel();
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		int index = this.exists(id, cart);

		int quantity = cart.get(index).getQuantity();

		if (quantity > 0) {
			quantity--;
			cart.get(index).setQuantity(quantity);

			if (quantity == 0)
				cart.remove(index);
		}

		session.setAttribute("cart", cart);

		return "redirect:/cart/index";
	}

	@RequestMapping(value = "deleteSession", method = RequestMethod.GET)
	public String deleteSession(HttpSession session) {

		if (session.getAttribute("cart") != null) {
			session.invalidate();
		}

		return "redirect:/cart/index";
	}

	@RequestMapping(value = "deleteCart", method = RequestMethod.GET)
	public String deleteCart(HttpSession session) {

		if (session.getAttribute("cart") != null) {

			//ProductModel productModel = new ProductModel();
			List<Item> cart = new ArrayList<Item>();
			cart.removeAll(cart);
			session.setAttribute("cart", cart);

		}

		return "redirect:/cart/index";
	}

	private int exists(String id, List<Item> cart) {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getProduct().getId().equalsIgnoreCase(id)) {
				return i;
			}
		}
		return -1;
	}

}