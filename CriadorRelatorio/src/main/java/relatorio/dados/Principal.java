/*Desenvolva um programa que cadastre um Paciente de uma Clinica de Oftalmologia.
 *  Voc� deve produzir um relat�rio com os dados de todos os clientes. 
 *  Deve haver uma forma de escolher em qual dos formatos gravar os relat�rios:
 *   (txt, PDF, e outro formato escolhido por voc�)*/

package relatorio.dados;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import relatorios.layout.EstruturaRelatorio;
import relatorios.layout.RelatorioDOCX;
import relatorios.layout.RelatorioPDF;
import relatorios.layout.RelatorioTXT;

public class Principal {
	
	//PADR�O DE PROJETO METHOD FACTORY

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		FabricaRelatorios fr = new FabricaRelatorios();
		
		System.out.println("Escolha um formato para salvar o Relat�rio de Dados");
		System.out.println("1 - PDF\n" + "2 - TXT\n" + "3 - DOCX");
		int esc = ler.nextInt();
		fr.EscolhaFormatoDoc(esc);
			
	}
}

