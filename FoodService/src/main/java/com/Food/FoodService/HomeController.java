package com.Food.FoodService;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Food.FoodService.inter.FoodProductRepo;
import com.Food.FoodService.model.FoodProduct;

@Controller
public class HomeController {
	
	@Autowired
	FoodProductRepo  fs ;
	
	@RequestMapping("/")
	public String homepage( ) {
         return "Home" ;
	}
	
	@RequestMapping("addproduct")
	public String addProduct(FoodProduct fp) {
		fs.save(fp) ;
		return "Home" ;
	}
	
	@RequestMapping("getProduct")
	public String getProduct() {
		return "FetchProduct" ;
	}
	
	@RequestMapping("getProducts")
	public ModelAndView getProducts(int fid ) {
		System.out.println(fid);
		
		ModelAndView mv = new ModelAndView() ;
		mv.setViewName("FetchProduct");
		FoodProduct fp = null  ;
		fp = fs.findById(fid).orElse(new FoodProduct()) ;
		System.out.println(fp) ;
		mv.addObject(fp) ;
		return mv ;
		
	}
	
	@RequestMapping("getProductsName")
	public ModelAndView getProductByName(String fname) {
		ModelAndView mv =  new ModelAndView() ;
		mv.setViewName("FetchProduct");
		List <FoodProduct> fp = new ArrayList<>() ;
		fp = fs.findByfoodname(fname) ;
		mv.addObject(fp) ;
		return mv ;
		
	}

	

}
