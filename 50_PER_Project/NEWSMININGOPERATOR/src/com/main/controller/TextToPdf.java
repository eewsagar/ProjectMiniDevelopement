package com.main.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GCW
 */
/*
 * This class is part of the book "iText in Action - 2nd Edition"
 * written by Bruno Lowagie (ISBN: 9781935182610)
 * For more info, go to: http://itextpdf.com/examples/
 * This example only works with the AGPL version of iText.
 */
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;

/**
 * First iText example: Hello World.
 */
public class TextToPdf {

    public static void createPdf(File filename, String fileContains) throws DocumentException, IOException {
        System.out.println("fileContains = " + filename.getAbsolutePath());
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph(fileContains));
        // step 5
        document.close();
    }

    public static void main(String[] args) {
        try {
//            String readFile = readFile(new File("D://types_join.txt"));
//            createPdf(new File("D://file1.pdf"), readFile);
            readFile(new File("D://file1.pdf"));
        } catch (Exception e) {
        }
    }

    public static String readFile(File file) {
        String string = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte b[] = new byte[fileInputStream.available()];
            fileInputStream.read(b);
            string = new String(b);
            System.out.println("b = " + string);
        } catch (Exception e) {
        }
        return string;
    }
}
