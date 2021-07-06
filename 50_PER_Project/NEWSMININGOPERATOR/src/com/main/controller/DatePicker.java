/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rutvij
 */
public class DatePicker {

    int month = Calendar.getInstance().get(Calendar.MONTH);
    int year = Calendar.getInstance().get(Calendar.YEAR);
    JLabel l = new JLabel("", JLabel.CENTER);
    String day = "";
    JDialog d;
    JButton[] button = new JButton[49];

    public DatePicker(JFrame parent) {
        d = new JDialog();
        d.setModal(true);
        String[] header = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};


        JPanel p1 = new JPanel(new GridLayout(7, 7));
        p1.setPreferredSize(new Dimension(500, 120));
        for (int x = 0; x < button.length; x++) {
            final int Selection = x;
            button[x] = new JButton();
            button[x].setFocusPainted(false);
            button[x].setBackground(Color.WHITE);
            if (x > 6) {
                button[x].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        day = button[Selection].getActionCommand();
                        d.dispose();
                    }
                });
            }
            if (x < 7) {
                button[x].setText(header[x]);
//                button[x].setEnabled(false);
                System.out.println("month =" + header[x]);
                button[x].setForeground(Color.red);

            }
            p1.add(button[x]);
        }
        JPanel p2 = new JPanel(new GridLayout(1, 3));
        JButton previous = new JButton("<<Previous");
        previous.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                month--;
                displayDate();
            }
        });
        p2.add(previous);
        p2.add(l);
        JButton next = new JButton("Next>>");
        next.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                month++;
                displayDate();
            }
        });
        p2.add(next);
        d.add(p1, BorderLayout.CENTER);
        d.add(p2, BorderLayout.SOUTH);
        d.pack();
        d.setLocationRelativeTo(parent);
        displayDate();
        d.setVisible(true);
    }

    public void displayDate() {
        for (int x = 7; x < button.length; x++) {
            button[x].setText("");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int x = 6 + dayOfWeek, count = 1; count <= dayOfMonth; x++, count++) {
            button[x].setText("" + count);
        }
        l.setText(sdf.format(cal.getTime()));
        d.setTitle("Date Picker");
    }

    public String setPickedDate() {
        if (day.equals("")) {
            return day;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, Integer.parseInt(day));
        return sdf.format(cal.getTime());
    }
}
