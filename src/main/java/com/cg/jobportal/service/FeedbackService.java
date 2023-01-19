package com.cg.jobportal.service;

import com.cg.jobportal.entity.Feedback;

public interface FeedbackService {

	Feedback addFeedback(Feedback feedback);

	Feedback averageRating(String id);


}
