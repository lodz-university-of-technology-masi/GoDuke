package com.goduke.model;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "recruiters")
public class Recruiter implements Serializable {

	private static final long serialVersionUID = 9024922645981936041L;

	String id;
	String firstname;
	String lastname;
	String password;
	String email;

	public Recruiter() {}
	public Recruiter(Recruiter recruiter) {
		this.firstname = recruiter.getFirstname();
		this.lastname = recruiter.getLastname();
		this.password = recruiter.getPassword();
		this.email = recruiter.getEmail();
	}

	@DynamoDBHashKey(attributeName = "id")
    @DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@DynamoDBAttribute(attributeName = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@DynamoDBAttribute(attributeName = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@DynamoDBAttribute(attributeName = "firstname")
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@DynamoDBAttribute(attributeName = "lastname")
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
