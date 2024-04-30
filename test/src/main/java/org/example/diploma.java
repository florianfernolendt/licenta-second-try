package org.example;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class diploma {

    public static void generare(String numestudent,String sectiastudent,float medie) {
        try {
            String path = "/Users/florian/Desktop/Licenta/diploma.pdf";
            Document document = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            float fntSize;
            fntSize = 36f;
            Font font = FontFactory.getFont("/Users/florian/Desktop/Licenta/Axiforma-Regular.ttf", BaseFont.IDENTITY_H, fntSize);//aici e scaparea am reusit sa fac diacritice
            Paragraph para = new Paragraph(new Phrase("\n\nDIPLOMA DE ABSOLVIRE", font));
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            fntSize = 24f;
            font = FontFactory.getFont("/Users/florian/Desktop/Licenta/Axiforma-Regular.ttf", BaseFont.IDENTITY_H, fntSize);
            para = new Paragraph(new Phrase("\n\nSe acorda studentului " + numestudent + " de la Facultatea de Automatica si Calculatoare, sectia" + sectiastudent + " avand media generala la finele studiilor: " + medie, font));
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            fntSize = 16f;
            font = FontFactory.getFont("/Users/florian/Desktop/Licenta/Axiforma-Regular.ttf", BaseFont.IDENTITY_H, fntSize);
            para = new Paragraph(new Phrase("\n\nDECAN,                                                                                                                                    SECRETAR GENERAL,", font));
            document.add(para);
            document.close();
        }
        catch (Exception e) {
            System.out.println("Eroare!");
        }
}
}
