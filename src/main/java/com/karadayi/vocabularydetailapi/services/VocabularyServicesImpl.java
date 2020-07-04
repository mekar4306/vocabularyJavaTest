package com.karadayi.vocabularydetailapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karadayi.vocabularydetailapi.entities.Vocabulary;
import com.karadayi.vocabularydetailapi.repos.VocabularyRepository;


@Service
public class VocabularyServicesImpl implements VocabularyServices {

	@Autowired
	VocabularyRepository vocabularyRepository;


	public List<Vocabulary> listAllVocabularies() {
	

		return vocabularyRepository.findAll();

	}


	@Override
	public String sayHallo() {
		return "Hallo Dostum";
		
	}

}
