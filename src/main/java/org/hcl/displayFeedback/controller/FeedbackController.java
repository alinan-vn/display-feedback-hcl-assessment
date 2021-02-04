package org.hcl.displayFeedback.controller;

import java.util.List;

import org.hcl.displayFeedback.entity.FeedbackEntity;

import org.hcl.displayFeedback.crudRepository.FeedbackEntityCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackEntityCrudRepository feedbackEntityCrudRepository;
	
	@GetMapping
//	public List<FeedbackEntity> listFeedback(){
	public Iterable<FeedbackEntity> listFeedback(){
//		return feedbackEntityCrudRepository.findAll(); --> some cast would be needed here if used List, instead of iterable
		return feedbackEntityCrudRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public FeedbackEntity getFeedbackById(@PathVariable Long id) {
		return feedbackEntityCrudRepository.findById(id).get();
	}
	
	@PostMapping
	public FeedbackEntity saveFeedback(@RequestBody FeedbackEntity feedback) {
		return feedbackEntityCrudRepository.save(feedback);
	}
}
