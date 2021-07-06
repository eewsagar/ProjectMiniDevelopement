/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.algos;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author yuvraj
 */
public class TraningDataSet {

    private HashMap<String, String> hashMap;

    public TraningDataSet() {
        addDataSet();
    }

    public void addDataSet() {
        hashMap = new HashMap<>();
        hashMap.put("government", "politics");
        hashMap.put("party", "politics");
        hashMap.put("congress", "politics");
        hashMap.put("aap", "politics");
        hashMap.put("bjp", "politics");
        hashMap.put("jdu", "politics");
        hashMap.put("aam", "politics");
        hashMap.put("adami", "politics");
        hashMap.put("kejriwal", "politics");
        hashMap.put("arvind", "politics");
        hashMap.put("rahul", "politics");
        hashMap.put("gandhi", "politics");

        ///
        hashMap.put("cricket", "sports");
        hashMap.put("ashes", "sports");
        hashMap.put("team", "sports");
        hashMap.put("clarke", "sports");
        hashMap.put("hit", "sports");
        hashMap.put("bat", "sports");
        hashMap.put("flicked", "sports");
        hashMap.put("flayed", "sports");
        hashMap.put("pitch", "sports");
        hashMap.put("ashwin", "sports");
        hashMap.put("match", "sports");
        hashMap.put("ravichandran", "sports");
        hashMap.put("jadeja", "sports");
        hashMap.put("innings", "sports");
        hashMap.put("bowlers", "sports");

        ///
        hashMap.put("mars", "astrology");
        hashMap.put("uranus", "astrology");
        hashMap.put("Mars", "astrology");
        hashMap.put("Uranus", "astrology");
        hashMap.put("Leo", "astrology");
        ///
        hashMap.put("Actor", "movies");
        hashMap.put("promotional", "movies");
        hashMap.put("Bullett", "movies");
        hashMap.put("Sonakshi", "movies");
        hashMap.put("Vidyut", "movies");
        ///
        hashMap.put("Chemical", "sciences");
        hashMap.put("electron", "sciences");
        hashMap.put("wavelength", "sciences");
        hashMap.put("physical", "sciences");
        hashMap.put("photochemical", "sciences");
        hashMap.put("oxidation", "sciences");
        hashMap.put("Biology", "sciences");
        hashMap.put("organisms", "sciences");
        hashMap.put("evolution", "sciences");
        hashMap.put("atoms", "sciences");
        hashMap.put("chemistry", "sciences");
        hashMap.put("science", "sciences");
        hashMap.put("matter", "sciences");
        hashMap.put("reactions", "sciences");
        hashMap.put("interactions", "sciences");
        ///
        hashMap.put("bse", "business");
        hashMap.put("sensex", "business");
        hashMap.put("billion", "business");
        hashMap.put("dollar", "business");
        hashMap.put("rupee", "business");
        hashMap.put("currency", "business");
        hashMap.put("banks", "business");
        hashMap.put("market", "business");
        hashMap.put("price", "business");
        hashMap.put("scm", "business");
        hashMap.put("cng", "business");
        ///
        hashMap.put("microsoft", "technology");
        hashMap.put("app", "technology");
        hashMap.put("windows", "technology");

    }

    public String filter(String myword) {
        Set<String> keySet = hashMap.keySet();
        for (String string : keySet) {
            if (string.toLowerCase().equals(myword.toLowerCase())) {
                return hashMap.get(string).toString();
            }
        }
        return "";
    }
}
