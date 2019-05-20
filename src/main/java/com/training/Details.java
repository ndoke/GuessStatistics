package com.training;

public class Details {
    private Statistics guessStatistics;

    public String getDetails(String candidate, int count) {
        switch (count) {
            case 0:
                guessStatistics = new Statistics("no", "are", "s");
                break;
            case 1:
                guessStatistics = new Statistics("one", "is", "");
                break;
            default:
                guessStatistics = new Statistics(Integer.toString(count), "are", "s");
                break;
        }

        return guessStatistics.getNumber() + " " + candidate + guessStatistics.getPluralModifier() +
                " " +  guessStatistics.getVerb() + " available.";
    }
}
