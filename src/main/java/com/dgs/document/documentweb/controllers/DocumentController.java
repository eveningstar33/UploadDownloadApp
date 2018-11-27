package com.dgs.document.documentweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DocumentController {

	@RequestMapping("/displayUpload")
	public String displayUpload() {
		return "documentUpload";
	}
}
