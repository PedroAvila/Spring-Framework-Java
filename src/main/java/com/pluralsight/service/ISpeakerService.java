package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;

public interface ISpeakerService {

	List<Speaker> findAll();

}