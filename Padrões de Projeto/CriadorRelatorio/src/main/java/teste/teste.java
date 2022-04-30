package teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class teste {

	public teste(String f) {
		Document documentoPDF = new Document();
		
		try {
			PdfWriter.getInstance(documentoPDF, new FileOutputStream("Relatorio-1.0.pdf"));
			
			documentoPDF.open();
			
			Paragraph paragrafoTeste = new Paragraph(f);
			documentoPDF.add(paragrafoTeste);
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("Aquivo não encontrado!" + e.getMessage());
		}

		documentoPDF.close();

	}
	
	
}
