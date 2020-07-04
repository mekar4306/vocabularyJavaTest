package com.karadayi.vocabularydetailapi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Vocabulary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	
	private String article;
	private String word;
	private String  favorite;
	private String  isOkt;
    private String shown;
    private String vgroup;
    private String photoUrl;
    private String mineAdded;
    private String priorty;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "vocabulary")
    @JsonIgnore
    private VocabularyDetail VocabularyDetail;
}
