package relatorios.layout;
//package relatorio.dados;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.IIOImage;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import relatorio.dados.DadosClientes;

public class RelatorioPDF implements EstruturaRelatorio {
	
	private DadosClientes clientes;
	private Document docPdf; //onde vai adicionar as informações
	private String caminhoRelatorio = "RelatorioCliente.pdf";
	
	public RelatorioPDF(DadosClientes clientes) {
		//this.dados = dados;
		this.clientes = clientes;
		this.docPdf = new Document();
		try {
			PdfWriter.getInstance(this.docPdf, new FileOutputStream(caminhoRelatorio));
			this.docPdf.open();
			System.out.println("Relatório criado com sucesso! Para conferir o PDF,"
					+ "verifique na raiz do projeto");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.err.println("arquivo não encontrado" + e.getMessage());
			e.printStackTrace();
		}
		
	}

	public void gerarCabecalho() {
		try {
			//ADICIONANDO IMAGEM
			Image imagem = Image.getInstance("logo_estacio.png");
			imagem.scaleToFit(200, 200);
			docPdf.add(imagem);
			this.docPdf.add(new Paragraph(" "));
		} catch (BadElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Criando um paragrafo
		Paragraph paragrafoTitulo = new Paragraph();
		//Alinhamento do texto
		paragrafoTitulo.setAlignment(Element.ALIGN_CENTER);
		//Novo bloco de texto
		paragrafoTitulo.add(new Chunk(
						"RELATÓRIO DE DADOS",		//Titulo
						new Font(Font.HELVETICA, 24)// Fonte e tamanho
				));
		this.docPdf.add(paragrafoTitulo); //Adicionando esse parag. ao doc.
		this.docPdf.add(new Paragraph(" ")); //Para pular linhas;
		
		//ADICIONANDO DATA AO PDF
		Paragraph paragrafoData = new Paragraph();
		paragrafoData.setAlignment(Element.ALIGN_CENTER);
		paragrafoData.add(new Chunk( this.clientes.getData().toString())); 
		this.docPdf.add(paragrafoData);
		
		this.docPdf.add(new Paragraph(" "));
		
		Paragraph paragrafoSessao1 = new Paragraph("----------------------------------------------------------------------");
		paragrafoSessao1.setAlignment(Element.ALIGN_CENTER);
		this.docPdf.add(paragrafoSessao1);
		
		//ADICIONANDO DADOS DO CLIENTE AO PDF
		Paragraph paragrafoCliente = new Paragraph();
		paragrafoCliente.setAlignment(Element.ALIGN_LEFT);
		paragrafoCliente.add(new Chunk(clientes.toString(), new Font(Font.BOLD, 16)				
				));							// this.dados.getNomeCliente()
		this.docPdf.add(paragrafoCliente);
		
		Paragraph paragrafoSessao2 = new Paragraph("----------------------------------------------------------------------");
		paragrafoSessao2.setAlignment(Element.ALIGN_CENTER);
		this.docPdf.add(paragrafoSessao2);
		this.docPdf.add(new Paragraph(" "));

	}

	public void gerarCorpo() {
		//ADICIONANDO AS OBSERVAÇÕES
		Paragraph paragrafoObsv = new Paragraph();
		paragrafoObsv.setAlignment(Element.ALIGN_LEFT);
		paragrafoObsv.add(new Chunk(clientes.observCliente(), new Font(Font.BOLD, 16)));
		this.docPdf.add(paragrafoObsv);
		
		Paragraph pSessaoCabecalho = new Paragraph("----------------------------------------------------------------------");
		pSessaoCabecalho.setAlignment(Element.ALIGN_CENTER);
		this.docPdf.add(pSessaoCabecalho);
		this.docPdf.add(new Paragraph(" "));
		
		//ADICIONANDO DATA
		Paragraph pDataRodape = new Paragraph();
		pDataRodape.setAlignment(Element.ALIGN_RIGHT);
		pDataRodape.add(new Chunk("____________, _____ de _________", new Font(Font.BOLD, 14)));
		this.docPdf.add(pDataRodape);
		
		this.docPdf.add(new Paragraph(" "));
		this.docPdf.add(new Paragraph(" "));
		this.docPdf.add(new Paragraph(" "));
		
		
		//ADICIONANDO DATA
		Paragraph pAssRodape = new Paragraph();
		pAssRodape.setAlignment(Element.ALIGN_CENTER);
		pAssRodape.add(new Chunk("_________________________________\n"));
		pAssRodape.add(new Chunk("Assinatura e Rubrica", new Font(Font.BOLD, 14)));
		this.docPdf.add(pAssRodape);		
		
	}

	public void gerarRodape() {
		
		this.docPdf.add(new Paragraph(" "));
		this.docPdf.add(new Paragraph(" "));
		
		Paragraph pSessaoRodape = new Paragraph("-----------------------------------------------\n");
		pSessaoRodape.setAlignment(Element.ALIGN_CENTER);
		this.docPdf.add(pSessaoRodape);
		
		
		Paragraph pSessaoRodape2 = new Paragraph();
		pSessaoRodape2.setAlignment(Element.ALIGN_CENTER);
		pSessaoRodape2.add(new Chunk("https://github.com/Jefferson-Pedro", new Font(Font.ITALIC, 10)));
		this.docPdf.add(pSessaoRodape2);
		
	}

	public void imprimir() {
		if (this.docPdf != null && this.docPdf.isOpen()) 
			this.docPdf.close();
		else
			System.out.println("Documento fechado ou não existe");
	}

}
