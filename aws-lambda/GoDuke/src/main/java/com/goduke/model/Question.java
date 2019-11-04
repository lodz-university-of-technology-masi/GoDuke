package com.goduke.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;

@DynamoDBTable(tableName="Questions")
public class Question {

    private Integer number;
    private String type;
    private String language;
    private String question;
    private List<String> options;

    @DynamoDBHashKey(attributeName="Number")
    @DynamoDBAutoGeneratedKey
    public Integer getNumber() { return number; }
    public void setNumber(Integer number) {this.number = number; }

    @DynamoDBAttribute(attributeName="Type")
    public String getType() {return type; }
    public void setType(String title) { this.type = type; }

    @DynamoDBAttribute(attributeName="language")
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    @DynamoDBAttribute(attributeName="question")
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    @DynamoDBAttribute(attributeName = "options")
    public List<String> getOptions() { return options; }
    public void setOptions(List<String> options) { this.options = options; }
}