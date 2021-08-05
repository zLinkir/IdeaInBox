package com.IdeaBox.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.IdeaBox.models.sugestoes.Sugestao;
import com.IdeaBox.repository.SugestaoRepository;



@Controller
public class SugestaoController {
	@Autowired
	private SugestaoRepository sr;
	
	

	@RequestMapping(value="/timeline", method=RequestMethod.POST)
	public String form(Sugestao sugestao) {
		sr.save(sugestao);
		return "redirect:/timeline";
	}
	
	
	

}
