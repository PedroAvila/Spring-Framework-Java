package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Speaker;

public interface ISpeakerRepository {

	List<Speaker> findAll();

}