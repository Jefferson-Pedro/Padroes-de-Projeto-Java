package relatorios.layout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
//import org.apache.poi.xwpf.usermodel;

import relatorio.dados.DadosClientes;

public class RelatorioDOCX implements EstruturaRelatorio{
	
	private DadosClientes clientes;
	private FileOutputStream arquivo = null;
	private XWPFDocument documento;
	
	

	public RelatorioDOCX(DadosClientes clientes) {
			this.clientes = clientes;
			try {
			this.documento = new XWPFDocument();
			arquivo = new FileOutputStream(new File("RelatorioDOCX.docx"));
			System.out.println("Relatório criado com sucesso! Para conferir o DOCX,"
					+ "verifique na raiz do projeto.");
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro ao criar o documento.");
			e.printStackTrace();
		}
	}

	public void gerarCabecalho() {
		XWPFParagraph pCab = documento.createParagraph();
		pCab.setAlignment(ParagraphAlignment.CENTER);
		XWPFRun rodar = pCab.createRun();
		rodar.setText("RELATÓRIO DE DADOS\n"); //Adicionando texto
		rodar.setBold(true);
		
		rodar.addBreak();
		rodar.setText("\n----------------------------------------------------------------------");
		rodar.addBreak();//Para pular linha;
				
	}

	public void gerarCorpo() {
		XWPFParagraph pCorpo = documento.createParagraph();
		pCorpo.setAlignment(ParagraphAlignment.LEFT);
		XWPFRun rodar = pCorpo.createRun();
		rodar.setText(clientes.toString()); //Adicionando dados do cliente
		//rodar.setBold(true);
		
		rodar.addBreak();
		rodar.addBreak();
		rodar.setText("\n-----------------------------------------------------------------------" +
						"------------------------------------------------------");
		
		XWPFParagraph pCorpo2 = documento.createParagraph();
		pCorpo2.setAlignment(ParagraphAlignment.LEFT);
		XWPFRun rodar2 = pCorpo2.createRun();
		rodar2.setText(clientes.observCliente()+ " "); //Adicionando dados do cliente
		//rodar.setBold(true);
		
		rodar2.addBreak();
		rodar2.addBreak();
		rodar2.setText("\n-----------------------------------------------------------------------"
						+ "------------------------------------------------------");
						
		rodar2.addBreak();
		
		XWPFParagraph pData = documento.createParagraph();
		pData.setAlignment(ParagraphAlignment.RIGHT);
		XWPFRun rodar3 = pData.createRun();
		rodar3.setText("\n____________, _____ de _________"); //Adicionando data
		rodar3.setBold(true);
		
		rodar3.addBreak();
		rodar3.addBreak();
		
		XWPFParagraph pRubrica = documento.createParagraph();
		pRubrica.setAlignment(ParagraphAlignment.CENTER);
		XWPFRun rodar4 = pRubrica.createRun();
		rodar4.setText("_________________________________\n"); //Adicionando data
		rodar4.addBreak();
		rodar4.setText("Assinatura e Rubrica");
		rodar4.setBold(true);
		
		rodar4.addBreak();
		rodar4.addBreak();
		rodar4.setText("\n-----------------------------------------------------------------------" +
								"------------------------------------------------------");
		
		
	}

	public void gerarRodape() {
		XWPFParagraph pRubrica = documento.createParagraph();
		pRubrica.setAlignment(ParagraphAlignment.CENTER);
		XWPFRun rodar = pRubrica.createRun();
		rodar.setText("https://github.com/Jefferson-Pedro"); //Adicionando data
		rodar.setBold(true);
	
	}

	public void imprimir() {
		try {
			if (this.arquivo != null)
				documento.write(arquivo); // para escrever o documento
			} catch (IOException e) {
			System.out.println("Documento fechado ou não existe");
			e.printStackTrace();
		}
		
	}

}
