/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.controller;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.main.view.LoginWindow;
import com.main.view.SplashScreen;
import java.util.Properties;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class ApplicationManager implements IAppContext {

    private static IAppContext appContext;
    private static LoginWindow mainWindow;

    public ApplicationManager() throws Exception {
        mainWindow = new LoginWindow();
    }

    public void start() {
        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Properties props = new Properties();
                    props.put("logoString", " ");
                    AcrylLookAndFeel.setCurrentTheme(props);
                    UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    SplashScreen splashScreen = new SplashScreen(mainWindow, true);
                    splashScreen.setVisible(true);
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    JDialog.setDefaultLookAndFeelDecorated(true);
                    ApplicationManager applicationManager = new ApplicationManager();
                    appContext = applicationManager;
                    applicationManager.start();
                } catch (Exception e) {
                    System.out.println("e = " + e);
                }
            }
        });
    }

    public static IAppContext getAppContext() {
        return appContext;
    }

    public void exitApplication() {
        System.exit(0);
    }
}
