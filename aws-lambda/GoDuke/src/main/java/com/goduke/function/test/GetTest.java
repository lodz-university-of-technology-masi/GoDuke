package com.goduke.function.test;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.goduke.model.test.Test;

public class GetTest implements RequestHandler<Test, Test> {
    DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(AmazonDynamoDBClientBuilder.defaultClient());
    @Override
    public Test handleRequest(Test input, Context context) {
        String id = input.getId();
        if(id == null){
            throw new RuntimeException("null id");
        }
        Test test = dynamoDBMapper.load(Test.class, id);
        if(test == null){
           throw new RuntimeException("test does not exist");
        }
        return test;
    }
}
