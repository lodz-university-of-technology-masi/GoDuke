package com.goduke.function;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.goduke.model.Question;

public class AddQuestion implements RequestHandler<Question, String> {

    @Override
    public String handleRequest(Question question, Context context) {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
        DynamoDBMapper mapper = new DynamoDBMapper(client);
        if(mapper.load(Question.class, question.getNumber()) != null) {
        	return "Error!";
        }
        mapper.save(question);        
        return "Success!";
    }

}
