/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.controller;

import java.awt.Window;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author namita
 */
public class InputValidor {

    private static final String DATE_PATTERN
            = //             "((18|19|20)\\d\\d)[- /](0?[1-9]|1[012])[- /](3[01]|[12][0-9]|0?[1-9])"; // yy-mm-dd pattern
            "(3[01]|[12][0-9]|0?[1-9])[- /](0?[1-9]|1[012])[- /]((19|20)\\d\\d)";

    public static boolean validateString(Window window, String input, String message) {
        if (input.length() < 2) {
            JOptionPane.showMessageDialog((JFrame) window, message, "Error!!!", JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static boolean validateText(String input, String message, Window window) {
        if (input.length() < 1) {
            JOptionPane.showMessageDialog((JFrame) window, message, "Error!!!", JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static boolean validateEMail(String input, String message, Window window) {

        try {
            try {
                String[] split = input.split("@");
            } catch (Exception e) {
                JOptionPane.showMessageDialog((JFrame) window, message, "Error!!!", JOptionPane.ERROR_MESSAGE);
                return Boolean.FALSE;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog((JFrame) window, message, "Error!!!", JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static boolean validateInteger(Window window, String input, String message) {
        try {
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog((JFrame) window, message, "Error!!!", JOptionPane.ERROR_MESSAGE);
                return Boolean.FALSE;
            }
        } catch (Exception e) {
        }
        return Boolean.TRUE;
    }

    public InputValidor() {
    }

    public static boolean validateDate(Window window, String input, String message) {
        boolean status = Boolean.FALSE;

        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            matcher.reset();
            if (matcher.find()) {
                String day = matcher.group(1);
                int year = Integer.parseInt(matcher.group(4));
                String month = matcher.group(2);

                if (day.equals("31")
                        && (month.equals("4") || month.equals("6") || month.equals("9")
                        || month.equals("11") || month.equals("04") || month.equals("06")
                        || month.equals("09"))) {
                    status = Boolean.FALSE;
                } else if (month.equals("2") || month.equals("02")) {
                    if (year % 4 == 0) {
                        if (day.equals("30") || day.equals("31")) {
                            status = Boolean.FALSE;
                        } else {
                            status = Boolean.TRUE;
                        }
                    } else {
                        if (day.equals("29") || day.equals("30") || day.equals("31")) {
                            status = Boolean.FALSE;
                        } else {
                            status = Boolean.TRUE;
                        }
                    }
                } else {
                    status = Boolean.TRUE;
                }
            } else {
                status = Boolean.FALSE;
            }
        } else {
            status = Boolean.FALSE;
        }
        if (status) {
            return status;
        } else {
            JOptionPane.showMessageDialog((JFrame) window, message, "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
        return status;
    }
}
