package com.karadayi.vocabularydetailapi.services;

import java.util.List;

import com.karadayi.vocabularydetailapi.entities.Vocabulary;

public interface VocabularyServices {
	
	List<Vocabulary>  listAllVocabularies();
	
	String sayHallo();

}
