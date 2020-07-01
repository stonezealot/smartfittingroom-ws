package com.epb.smartfittingroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

	//
	// request mappings
	//

	//
	// fields
	//

//	private final Log log = LogFactory.getLog(AppController.class);

//	private final ProcedureService procedureService;

	//
	// constructor
	//

	@Autowired
	public AppController(
//			final ProcedureService procedureService, 
	) {

		super();

//		this.procedureService = procedureService;

	}

}
