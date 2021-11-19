package ir.project.data.entity;

import ir.project.data.enums.Classification;
import ir.project.data.enums.KindQuestion;

public class Question {
    private String title;
    private String question;
    private String answer;
    private KindQuestion kindQuestion;
    private Classification classification;

    public Question() {
    }

    public String getTitle() {
        return title;
    }

    public Question setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public Question setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public Question setAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    public KindQuestion getKind() {
        return kindQuestion;
    }

    public Question setKind(KindQuestion kindQuestion) {
        this.kindQuestion = kindQuestion;
        return this;
    }

    public Classification getClassification() {
        return classification;
    }

    public Question setClassification(Classification classification) {
        this.classification = classification;
        return this;
    }
}
