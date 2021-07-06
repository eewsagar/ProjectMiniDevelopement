package com.main.algos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author yuvraj
 */
public class StopWords {

    static String[] stopwords = {"thats", "said", "form", "told", "", "yes", "a", "about", "above", "above", "across", "after", "afterwards", "again", "against", "all", "almost",
        "alone", "along", "already", "also", "although", "always", "am", "among", "amongst", "amoungst", "amount", "an", "and",
        "another", "any", "anyhow", "anyone", "anything", "anyway", "anywhere", "are", "around", "as", "at", "back", "be", "became",
        "because", "become", "becomes", "becoming", "been", "before", "beforehand", "behind", "being", "below", "beside", "besides",
        "between", "beyond", "bill", "both", "bottom", "but", "by", "call", "can", "cannot", "cant", "co", "con", "could", "couldnt",
        "cry", "de", "describe", "detail", "do", "done", "down", "due", "during", "each", "eg", "eight", "either", "eleven", "else",
        "elsewhere", "empty", "enough", "etc", "even", "ever", "every", "everyone", "everything", "everywhere", "except", "few",
        "fifteen", "fify", "fill", "find", "fire", "first", "five", "for", "former", "formerly", "forty", "found", "four", "from",
        "front", "full", "further", "get", "give", "go", "had", "has", "hasnt",
        "have", "he", "hence", "her", "here", "hereafter", "hereby", "herein", "hereupon", "hers", "herself",
        "him", "himself", "his", "how", "however", "hundred", "ie", "if", "in", "inc", "indeed", "interest", "into",
        "is", "it", "its", "itself", "keep", "last", "latter", "latterly", "least", "less", "ltd", "made", "many",
        "may", "me", "meanwhile", "might", "mill", "mine", "more", "moreover", "most", "mostly", "move", "much", "must",
        "my", "myself", "name", "namely", "neither", "never", "nevertheless", "next", "nine", "no", "nobody", "none",
        "noone", "nor", "not", "nothing", "now", "nowhere", "of", "off", "often", "on", "once", "one", "only", "onto",
        "or", "other", "others", "otherwise", "our", "ours", "ourselves", "out", "over", "own", "part", "per", "perhaps",
        "please", "put", "rather", "re", "same", "see", "seem", "seemed", "seeming", "seems", "serious", "several", "she",
        "should", "show", "side", "since", "sincere", "six", "sixty", "so", "some", "somehow", "someone", "something",
        "sometime", "sometimes", "somewhere", "still", "such", "system", "take", "ten", "than", "that", "the", "their",
        "them", "themselves", "then", "thence", "there", "thereafter", "thereby", "therefore", "therein", "thereupon",
        "these", "they", "thickv", "thin", "third", "this", "those", "though", "three", "through", "throughout", "thru",
        "thus", "to", "together", "too", "top", "toward", "towards", "twelve", "twenty", "two", "un", "under", "until",
        "up", "upon", "us", "very", "via", "was", "we", "well", "were", "what", "whatever", "when", "whence", "whenever",
        "where", "whereafter", "whereas", "whereby", "wherein", "whereupon", "wherever", "whether", "which", "while",
        "whither", "who", "whoever", "whole", "whom", "whose", "why", "will", "with", "within", "without", "would", "yet",
        "you", "your", "yours", "yourself", "yourselves", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "1.", "2.", "3.", "4.", "5.", "6.", "11",
        "7.", "8.", "9.", "12", "13", "14", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
        "terms", "CONDITIONS", "conditions", "values", "interested.", "care", "sure", ".", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "{", "}", "[", "]", ":", ";", ",", "<", ".", ">", "/", "?", "_", "-", "+", "=",
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
        "contact", "grounds", "buyers", "tried", "said,", "plan", "value", "principle.", "forces", "sent:", "is,", "was", "like",
        "discussion", "tmus", "diffrent.", "layout", "area.", "thanks", "thankyou", "hello", "bye", "rise", "fell", "fall", "psqft.", "http://", "km", "miles"};

    public static String getCleanString(String sampleText) {

        Set<String> stopWords = new HashSet<String>();
        for (int index = 0; index < stopwords.length; index++) {
            stopWords.add(stopwords[index]);
        }
        StringBuffer clean = new StringBuffer();
        int index = 0;

        while (index < sampleText.length()) {
            int nextIndex = sampleText.indexOf(" ", index);
            if (nextIndex == -1) {
                nextIndex = sampleText.length() - 1;
            }
            String word = sampleText.substring(index, nextIndex);
            if (!stopWords.contains(word.toLowerCase())) {
                clean.append(word);
                if (nextIndex < sampleText.length()) {
                    // this adds the word delimiter, e.g. the following space
                    clean.append(sampleText.substring(nextIndex, nextIndex + 1));
                }
            }
            index = nextIndex + 1;
        }
        return clean.toString();
    }
}
