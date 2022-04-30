package relatorios.layout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import relatorio.dados.DadosClientes;

public class RelatorioTXT implements EstruturaRelatorio {
	
	private PrintWriter pr;
	private DadosClientes clientes;
	private FileOutputStream arquivo;
		
	public RelatorioTXT(DadosClientes clientes) throws IOException {
		
		this.clientes = clientes;
		
		try {
			arquivo = new FileOutputStream("RelatorioCliente.txt");
			pr = new PrintWriter(arquivo);
			System.out.println("Relatório criado com sucesso! Para conferir o TXT,"
					+ "verifique na raiz do projeto.");
			
			//pr.close();
			//arquivo.close();
				
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao escrever arquivo" + e.getMessage());
		}
		
	}

	public void gerarCabecalho() {
		pr.print("RELATÓRIO DE DADOS");
		pr.print("\n");
		pr.print("----------------------------------------------------------------------");
		pr.print("\n");
	}

	public void gerarCorpo() {
		pr.print("\n");
		pr.print(clientes.toString());
		pr.print("\n-----------------------------------------------------------------");
		pr.print("\n");
		pr.print(clientes.observCliente());
		pr.print("\n");
		
	}

	public void gerarRodape() {
		pr.print("\n");
		pr.print("\n-----------------------------------------------------------------");
		pr.print("https://github.com/Jefferson-Pedro");
		
	}

	public void imprimir() {
		
			try {
				if (this.arquivo != null)
				this.pr.close();
				this.arquivo.close();
			} catch (IOException e) {
				System.out.println("Documento fechado ou não existe");
				e.printStackTrace();
			}
	}
}

