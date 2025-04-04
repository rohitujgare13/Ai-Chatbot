package com.studenthelpdesk.helpdesk.model;


public class Faq {
    private String question;
    private String answer;

    public Faq(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
