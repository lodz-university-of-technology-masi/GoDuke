package com.goduke.validator;

import com.goduke.model.Question;

import java.util.List;

public class QuestionValidator {
    public static boolean validate(Question question){
        QuestionValidator questionValidator = new QuestionValidator();
        return questionValidator.checkNull(question)
                && questionValidator.checkType(question.getType())
                && questionValidator.checkOptions(question.getOptions(), question.getType());
    }

    private boolean checkType(String type){
        return type.equals("open") || type.equals("close") || type.equals("numerical");

    }

    private boolean checkOptions(List<String> options, String type){
        if(!type.equals("close")){
            if(options != null) {
                return options.size() == 0;
            }
            return true;
        }else{
            if(options == null){
                return false;
            }
            return options.size() != 0;
        }
    }

    private boolean checkNull(Question question){
        return question.getLanguage() != null
                && question.getQuestion() != null
                && question.getType() != null;
    }
}