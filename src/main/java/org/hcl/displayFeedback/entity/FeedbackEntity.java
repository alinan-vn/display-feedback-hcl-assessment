package org.hcl.displayFeedback.entity;

import javax.persistence.*;

@Table(name = "feedback")
@Entity
public class FeedbackEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	public Long getId() { return id; }
	
	@Column(name = "description")
	private String description;
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	@Column(name = "rating")
	private Integer rating;
	
	public Integer getRating() { return rating; }
	public void setRating(Integer rating) { this.rating = rating; }
}
