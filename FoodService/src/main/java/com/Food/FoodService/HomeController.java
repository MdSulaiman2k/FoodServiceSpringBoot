package com.Food.FoodService;

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
	public ModelAndView getProduct(int fid) {
		ModelAndView mv = new ModelAndView("FetchProduct") ;
		FoodProduct fp = fs.findById(fid).orElse(null) ;
		return mv ;
	} 

}
