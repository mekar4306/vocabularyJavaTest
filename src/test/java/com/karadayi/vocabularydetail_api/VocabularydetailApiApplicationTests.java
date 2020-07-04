package com.karadayi.vocabularydetail_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.karadayi.vocabularydetailapi.VocabularydetailApiApplication;
import com.karadayi.vocabularydetailapi.entities.Vocabulary;
import com.karadayi.vocabularydetailapi.entities.VocabularyDetail;
import com.karadayi.vocabularydetailapi.repos.VocabularyRepository;


@SpringBootTest(classes =VocabularydetailApiApplication.class )
public class VocabularydetailApiApplicationTests {
	
	@Autowired
	VocabularyRepository vocabularyRepository;

	@Test
	public void contextLoads() {
	}

	
	@Test
	public void testCreateVocabulary(){
		
		
		Vocabulary vocabulary = new Vocabulary();
		vocabulary.setArticle("Java");
		vocabulary.setFavorite("Spring");
		vocabulary.setIsOkt("1");
		vocabulary.setMineAdded("mineaddes");
		vocabulary.setPhotoUrl("www.meteabi.com");
		vocabulary.setPriorty("major");
		vocabulary.setShown("xxx");
		vocabulary.setType("verb");
		vocabulary.setVgroup("compound");
		vocabulary.setWord("run");
		
		VocabularyDetail vocabularyDetail=new VocabularyDetail();
		vocabularyDetail.setSentence("I run everyday");
		vocabularyDetail.setSentenceMeaning("Hergün kosarim");
		vocabularyDetail.setVocabulary(vocabulary);
		
		vocabulary.setVocabularyDetail(vocabularyDetail   );
		
		vocabularyRepository.save(vocabulary);
	}
}
