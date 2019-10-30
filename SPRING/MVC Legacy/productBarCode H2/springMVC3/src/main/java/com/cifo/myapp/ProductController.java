package com.cifo.myapp;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = {"product"})
public class ProductController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		
        //ProductModel productModel = new ProductModel();
        modelMap.put("products", ProductDAO.getAllProducts());
		//modelMap.put("products", productModel.findAll());
		
            return "product/index";
	}

	@RequestMapping(value = "detail/{id}", method = RequestMethod.GET)
	public String detail (@PathVariable("id") String id, ModelMap modelMap) {

		//ProductModel productModel = new ProductModel();
		//modelMap.put("product", productModel.find(id));
            modelMap.put("products", ProductDAO.getProductById(id));

		return "product/detail";
	}

	@RequestMapping(value = "barcode/{id}", method = RequestMethod.GET)
	public void barcode(@PathVariable("id") String id, HttpServletResponse response) throws Exception {
		

        response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(ZXingHelper.getBarCodeImage(id, 2000, 200));
		outputStream.flush();
		outputStream.close();
	}

}