package com.portfolio.bean;

import javax.persistence.Entity;

@Entity
public class SkillDetail {

	private String skillCategory;
	private String marks;

	public String getSkillCategory() {
		return skillCategory;
	}

	public void setSkillCategory(String skillCategory) {
		this.skillCategory = skillCategory;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

}
