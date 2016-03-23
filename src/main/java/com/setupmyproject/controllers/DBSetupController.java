package com.setupmyproject.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.setupmyproject.components.StepDiscovery;
import com.setupmyproject.controllers.forms.DBConfigurationForm;

@Controller
@Transactional
public class DBSetupController {

	@Autowired
	private StepDiscovery stepDiscovery;

	@RequestMapping(value="/setup/db/addons",method=RequestMethod.POST)
	public ModelAndView chooseDBAddons(DBConfigurationForm dbConfigurationForm){
		return stepDiscovery.nextPage(this,dbConfigurationForm);
	}
}