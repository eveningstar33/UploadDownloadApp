package com.dgs.document.documentweb.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dgs.document.documentweb.entities.Document;
import com.dgs.document.documentweb.repos.DocumentRepository;

@Controller
public class DocumentController {
	
	@Autowired
	private DocumentRepository repository;

	@RequestMapping("/displayUpload")
	public String displayUpload() {
		return "documentUpload";
	}
	
	@PostMapping("/upload")
	public String uploadDocument(@RequestParam("document") MultipartFile multipartFile, 
			@RequestParam("id") long id, ModelMap modelMap) {
		Document document = new Document();
		document.setId(id);
		document.setName(multipartFile.getName()); 
		try {
			document.setData(multipartFile.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} 
		repository.save(document); 
		List<Document> documents = repository.findAll(); 
		modelMap.addAttribute("documents", documents); 
		return "documentUpload";
	}
}
