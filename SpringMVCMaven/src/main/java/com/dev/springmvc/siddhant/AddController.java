package com.dev.springmvc.siddhant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev.springmvc.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		
		int i = Integer.parseInt(request.getParameter("input1"));
		int j = Integer.parseInt(request.getParameter("input2"));
		
		AddService service = new AddService();
		int k = service.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("destination.jsp");
		mv.addObject("result",k);
		
		return mv;
	}
}
