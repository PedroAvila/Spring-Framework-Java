package com.pluralsight.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.ISpeakerRepository;

@Service( "speakerService" )
@Profile("dev")
public class SpeakerServiceImpl implements ISpeakerService {
	
	private ISpeakerRepository repository;
	
	public SpeakerServiceImpl() {
		System.out.println("SpeakServiceImpl no args constructor");
	}
	
	@Autowired
	public SpeakerServiceImpl(ISpeakerRepository speakerRepository) {
		System.out.println("SpeakServiceImpl repository constructor");
		repository = speakerRepository;
	}
	
	@PostConstruct
	private void initialize() {
		System.out.println("We'r called after the constructors");
	}
	
	public List<Speaker> findAll(){
		return repository.findAll();
	}

	
	public void setRepository(ISpeakerRepository repository) {
		System.out.println("SpeakServiceImpl setter");
		this.repository = repository;
		
	}
	
	

}
