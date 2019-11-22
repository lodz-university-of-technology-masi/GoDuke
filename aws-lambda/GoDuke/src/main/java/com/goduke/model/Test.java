package com.goduke.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;

@DynamoDBTable(tableName = "RecruitmentTests")
public class Test implements Serializable {


	private String id;
	private List<String> languages;
	private String name;
	private String description;
	private List<String> questionsIds;
	private String recruiterId;
	private List<String> candidatesIds;
	
	public Test() {
		
	}
	
	public Test(String json) {
		Gson gson = new Gson();
		Test request = gson.fromJson(json, Test.class);
		this.id = request.getId();
		this.languages = request.getLanguages();
		this.name = request.getName();
		this.description = request.getDescription();
		this.questionsIds = request.getQuestionsIds();
		this.recruiterId = request.getRecruiterId();
		this.candidatesIds = request.getCandidatesIds();
	}

	@DynamoDBHashKey(attributeName = "id")
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBAttribute(attributeName = "languages")
	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@DynamoDBAttribute(attributeName = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@DynamoDBAttribute(attributeName = "recruiter_id")
	public String getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(String recruiterId) {
		this.recruiterId = recruiterId;
	}

	@DynamoDBAttribute(attributeName = "candidates_ids")
	public List<String> getCandidatesIds() {
		return candidatesIds;
	}

	public void setCandidatesIds(List<String> candidatesIds) {
		this.candidatesIds = candidatesIds;
	}
	
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}


	@DynamoDBAttribute(attributeName = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@DynamoDBAttribute(attributeName = "questions")
	public List<String> getQuestionsIds() {
		return questionsIds;
	}

	public void setQuestionsIds(List<String> questionsIds) {
		this.questionsIds = questionsIds;
	}
}
