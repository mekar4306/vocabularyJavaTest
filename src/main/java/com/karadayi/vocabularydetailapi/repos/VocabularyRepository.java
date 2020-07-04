package com.karadayi.vocabularydetailapi.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.karadayi.vocabularydetailapi.entities.Vocabulary;

public interface VocabularyRepository extends JpaRepository<Vocabulary, Long> {

	

}
