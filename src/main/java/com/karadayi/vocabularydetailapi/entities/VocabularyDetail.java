package com.karadayi.vocabularydetailapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class VocabularyDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sentence;	
	private String sentenceMeaning;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "id")
	@JsonIgnore
	private Vocabulary vocabulary;
	
}
