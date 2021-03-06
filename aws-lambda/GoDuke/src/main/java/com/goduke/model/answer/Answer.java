package com.goduke.model.answer;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.goduke.converter.TestTypeConverter;
import com.goduke.model.test.Test;

import java.io.Serializable;
import java.util.List;

@DynamoDBTable(tableName = "answers")
public class Answer implements Serializable {
    private String id;
    private Test test;
    private String candidate;
    private List<String> answers;
    private List<Boolean> rates;
    private boolean isRated;
    public Answer(){ }
    @DynamoDBHashKey(attributeName = "id")
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @DynamoDBTypeConverted(converter = TestTypeConverter.class)
    @DynamoDBAttribute(attributeName = "test")
    public Test getTest() {
        return test;
    }
    @DynamoDBAttribute(attributeName = "test")
    public void setTest(Test test) {
        this.test = test;
    }
    @DynamoDBAttribute(attributeName = "candidate")
    public String getCandidate() {
        return candidate;
    }
    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }
    @DynamoDBAttribute(attributeName = "answers")
    public List<String> getAnswers() {
        return answers;
    }
    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
    @DynamoDBAttribute(attributeName = "rates")
    public List<Boolean> getRates() {
        return rates;
    }
    public void setRates(List<Boolean> rates) {
        this.rates = rates;
    }
    @DynamoDBAttribute(attributeName = "rated")
    public boolean isRated() {
        return isRated;
    }
    public void setRated(boolean rated) {
        isRated = rated;
    }
}
