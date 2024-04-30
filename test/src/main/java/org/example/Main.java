package org.example;


import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfCopyFields;
import com.itextpdf.text.pdf.PdfReader;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, DocumentException {
        System.out.println("Hello World!");
        //le genereaza pe rand
        pdf.generare();

        student s = new student("Ivan-Fernolendt","Marius-Florian","ACTM001","5011114350033","Timisoara","Alice-Liliana","Ioan","Timisoara","Timis",1,7 ,2020,10,1,1);
        foaiematricola.generare(s);
        //le leaga intrun singur document la final
        PdfReader report1 = new PdfReader("/Users/florian/Desktop/Licenta/registru.pdf");
        PdfReader report2 = new PdfReader("/Users/florian/Desktop/Licenta/registru_personal.pdf");
        PdfCopyFields copy = new PdfCopyFields(new FileOutputStream("/Users/florian/Desktop/Licenta/final.pdf"));
        copy.addDocument(report1);
        copy.addDocument(report2);
        copy.close();
        diploma.generare("Ivan Fernolendt Marius Florian", "Informatica", 9.98F);
        System.out.println("\nDocument final generat cu succes.");
    }
}


