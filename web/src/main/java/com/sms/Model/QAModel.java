package com.sms.Model;

/**
 * Created by umars on 12/9/2017.
 */

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = IntrestBasedQA.class, name = "intrest")})
public abstract class QAModel {

    private String questionId;
    private String answer;

    public QAModel(String questionId, String answer) {
        this.questionId = questionId;
        this.answer = answer;
    }

    public QAModel() {
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
