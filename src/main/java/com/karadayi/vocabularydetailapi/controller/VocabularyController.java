package com.karadayi.vocabularydetailapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karadayi.vocabularydetailapi.entities.Vocabulary;
import com.karadayi.vocabularydetailapi.services.VocabularyServicesImpl;

@RestController
public class VocabularyController {

	@Autowired
	VocabularyServicesImpl vocabularyServicesImpl;
	
	@RequestMapping("/")
	public String hallo() {
		
		
		return vocabularyServicesImpl.sayHallo();
	}
	
	@RequestMapping("/vocabulary")
	public List<Vocabulary> findAllVocabuleries() {

		return vocabularyServicesImpl.listAllVocabularies();
	}
	
	
	

}
