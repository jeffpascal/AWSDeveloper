package com.sitesimplu;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
	
	
	@RequestMapping(value="/blog")
	public String serveBlog(Model model) {

		return "blog";
	}
	

	
}
