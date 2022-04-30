package relatorio.dados;

import java.io.IOException;

import relatorios.layout.EstruturaRelatorio;
import relatorios.layout.RelatorioDOCX;
import relatorios.layout.RelatorioPDF;
import relatorios.layout.RelatorioTXT;

public class FabricaRelatorios {
	
	private DadosClientes dc;
	private int escolha;
	
	public FabricaRelatorios() {
		
		this.dc = new DadosClientes();
	}

	public void EscolhaFormatoDoc(int escolha) throws IOException {
		
		switch (escolha) {
		case 1:
			EstruturaRelatorio relatorio = new RelatorioPDF(dc);
			relatorio.gerarCabecalho();
			relatorio.gerarCorpo();
			relatorio.gerarRodape();
			relatorio.imprimir();
			break;
		case 2:
			EstruturaRelatorio relatorio2 = new RelatorioTXT(dc);
			relatorio2.gerarCabecalho();
			relatorio2.gerarCorpo();
			relatorio2.gerarRodape();
			relatorio2.imprimir();
			break;
		case 3:
			EstruturaRelatorio relatorio3 = new RelatorioDOCX(dc);
			relatorio3.gerarCabecalho();
			relatorio3.gerarCorpo();
			relatorio3.gerarRodape();
			relatorio3.imprimir();
			break;
		default:
			System.out.println("Escolha invalida!");
			break;
		}
	}

}