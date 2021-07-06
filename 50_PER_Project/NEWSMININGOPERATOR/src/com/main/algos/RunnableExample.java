package com.main.algos;

import java.util.Arrays;
import java.util.Collection;

public class RunnableExample {

    public static void processNavieByes(String string) {
        final Classifier<String, String> bayes = new BayesClassifier<String, String>();

        final String[] positiveText = "normal".split("\\s");
        bayes.learn("positive", Arrays.asList(positiveText));

//        final String[] negativeText = "notnormal".split("\\s");
//        bayes.learn("negative", Arrays.asList(negativeText));
        final String[] unknownText1 = string.split(",");

//        final String[] unknownText2 = string.split(",");
        System.out.println(bayes.classify(Arrays.asList(unknownText1)).getCategory());

        Collection<Classification<String, String>> classifyDetailed = ((BayesClassifier<String, String>) bayes).classifyDetailed(Arrays.asList(unknownText1));
        System.out.println("classifyDetailed = " + classifyDetailed);
        bayes.setMemoryCapacity(500);
    }

    public static void main(String[] args) {
        final Classifier<String, String> bayes = new BayesClassifier<String, String>();

        //// this learning phase
        final String[] categorization1 = "sachin tendulkar greate ".split("\\s");
        for (String string : categorization1) {
            System.out.println("string = " + string);
        }
        bayes.learn("sports", Arrays.asList(categorization1));

        final String[] categorization2 = "amiba".split("\\s");
        bayes.learn("sciences", Arrays.asList(categorization2));

        //// this is testing phase
        final String[] unknownText1 = "this is news about sachin tendulkar".split("\\s");
        final String[] unknownText2 = "this is news about amiba".split("\\s");

        System.out.println( // will output "positive"
                bayes.classify(Arrays.asList(unknownText1)).getCategory());
        System.out.println( // will output "negative"
                bayes.classify(Arrays.asList(unknownText2)).getCategory());
        ((BayesClassifier<String, String>) bayes).classifyDetailed(
                Arrays.asList(unknownText1));
        bayes.setMemoryCapacity(500); // remember the last 500 learned classifications
    }
}
