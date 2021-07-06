/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.controller;

import java.util.Calendar;

/**
 *
 * @author yuvraj
 */
public class DateUtil {

    public static String getCurrentDate() {
        Calendar instance = Calendar.getInstance();
        int date = instance.get(Calendar.DAY_OF_MONTH);
        int month = instance.get(Calendar.MONTH);
        int year = instance.get(Calendar.YEAR);
        return date + "-" + (month + 1) + "-" + year;
    }

    public static Integer getCurrentYear() {
        Calendar instance = Calendar.getInstance();
        return instance.get(Calendar.YEAR);
    }

    public static String getNextDate(int nextBy) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_MONTH, nextBy);
        int date = instance.get(Calendar.DAY_OF_MONTH);
        int month = instance.get(Calendar.MONTH);
        int year = instance.get(Calendar.YEAR);
        return date + "-" + (month + 1) + "-" + year;
    }

    public static String getPreviousDate(int previousBy) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_MONTH, -previousBy);
        int date = instance.get(Calendar.DAY_OF_MONTH);
        int month = instance.get(Calendar.MONTH);
        int year = instance.get(Calendar.YEAR);
        return date + "-" + (month + 1) + "-" + year;
    }

    public static String getSystemTime() {
        Calendar instance = Calendar.getInstance();
        int hour = instance.get(Calendar.HOUR);
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);
        return hour + ":" + minute + ":" + second;
    }

    public static String getCurrentTime() {
        Calendar instance = Calendar.getInstance();
        int hour = instance.get(Calendar.HOUR);
        int minute = instance.get(Calendar.MINUTE);
        int i = instance.get(Calendar.AM_PM);
        if (i == 0) {
            return hour + ":" + minute + " " + "AM";
        }
        return hour + ":" + minute + " " + "PM";
    }
}
