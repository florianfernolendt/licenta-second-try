package org.example;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class pdf {
    public static void generare() {
        try {
            String path = "/Users/florian/Desktop/Licenta/registru.pdf";
            Document document = new Document(PageSize.A3);//se poate face a3 daca se vrea pe formuatul ala
            PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            Paragraph para = new Paragraph("REGISTRUL DE EVIDENTA AL STUDENTIILOR");
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            para = new Paragraph("Facultatea de automatica si calculatoare\n Sectia CTI-RO\n\n\n");
            document.add(para);
            PdfPTable table = new PdfPTable(3);
            PdfPCell coloana = new PdfPCell(new Phrase("Nr."));
            table.addCell(coloana);
            coloana = new PdfPCell(new Phrase("Numele si prenumele"));
            table.addCell(coloana);
            coloana = new PdfPCell(new Phrase("Nr. matricol"));
            table.addCell(coloana);
            table.setHeaderRows(1);
            table.setWidths(new int[]{20, 200, 40});
            for (int i = 0; i < 150; i++) {
                table.addCell(String.valueOf(i + 1));
                table.addCell("Ivan-Fernolendt Marius-Florian");
                table.addCell("MK4567");
            }

            document.add(table);
            document.close();
            System.out.println("Foaie matricola generata cu succes.");
        } catch (Exception e) {
            System.out.println("Eroare!");
        }
    }

}
