package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Activity;

public interface ExerciseService {

	/* (non-Javadoc)
	 * @see com.pluralsight.service.ExerciseService#findAllActivities()
	 */
	List<Activity> findAllActivities();

}