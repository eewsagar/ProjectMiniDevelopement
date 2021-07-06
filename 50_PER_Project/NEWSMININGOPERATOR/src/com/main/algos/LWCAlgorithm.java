package com.main.algos;

import com.main.dto.LCWDTO;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LWCAlgorithm {

    public static void main(String[] args) {
        ArrayList<LCWDTO> process = process(new File("d:/text.txt").getAbsolutePath());
        for (LCWDTO lcwdto : process) {
            System.out.println("lcwdto = " + lcwdto.getWord() + " => " + lcwdto.getFrequncy());
        }
    }

    public static ArrayList<LCWDTO> process(String string) {
        List<String> list = new ArrayList<>();
        ArrayList<LCWDTO> arrayList = new ArrayList<>();
        try {
            string = string.replaceAll("[0-9]", "");
            Pattern pt = Pattern.compile("[^a-zA-Z0-9 ]");
            Matcher match = pt.matcher(string);
            while (match.find()) {
                String s = match.group();
                string = string.replaceAll("\\" + s, "");
            }

            String[] split = StopWords.getCleanString(string.toLowerCase()).trim().split(" ");
            list.addAll(Arrays.asList(split));
        } catch (Exception e) {
        }
        Set<String> unique = new HashSet<>(list);
        for (String key : unique) {
            LCWDTO lCWDTO = new LCWDTO();
            lCWDTO.setWord(key);
            lCWDTO.setFrequncy(Collections.frequency(list, key) + "");
            arrayList.add(lCWDTO);
        }
        return arrayList;
    }
}
