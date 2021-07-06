package com.main.controller;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

public class ParcePDF {

    public static String parsePdf(String sourceFile) throws IOException {
        PdfReader reader = new PdfReader(sourceFile);
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
//        PrintWriter out = new PrintWriter(new FileOutputStream(outFile));
        TextExtractionStrategy strategy;
        String string = "";
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            strategy = parser.processContent(i, new SimpleTextExtractionStrategy());
            string = string + "" + strategy.getResultantText();
        }
        return string;
    }
}
