package com.training;

public class Statistics {
    private String number;
    private String verb;
    private String pluralModifier;

    public Statistics(String number, String verb, String pluralModifier) {
        this.number = number;
        this.verb = verb;
        this.pluralModifier = pluralModifier;
    }

    public String getNumber() {
        return number;
    }

    public String getVerb() {
        return verb;
    }

    public String getPluralModifier() {
        return pluralModifier;
    }
}
