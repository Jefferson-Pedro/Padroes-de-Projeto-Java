import javax.swing.JOptionPane;

import app.Application;
import factories.ISeaTransportFactory;
import factories.ITransportFactory;
import factories.MscTransport;
import factories.NineNineTransport;
import factories.UberTransport;

public class Main {
	
	public static Application configApplication() {
		
		Application application = new Application();
		ITransportFactory landFactory;
		ISeaTransportFactory maritimeFactory;
		
		String company = JOptionPane.showInputDialog(""
				+ "Digite uma das opções abaixo:\n"
				+ "-Uber\n" + "-99\n" + "-MSC");
		
		switch (company) {
		
		case "uber": {
			landFactory = new UberTransport();
			String typeTransportString = JOptionPane.showInputDialog(""
					+ "Digite uma das opções abaixo:\n"
					+ "Carro\n" + "Aviao\n");
			
			if (typeTransportString.equals("carro")) {
				application.landTransport(landFactory);
			}
			else if (typeTransportString.equals("aviao")) {
				application.airTransport(landFactory);
			}else{
				throw new IllegalArgumentException("Escolha invalida! " + typeTransportString);
			}
			break;
		}
		case "99": {
			landFactory = new NineNineTransport();
			String typeTransportString = JOptionPane.showInputDialog(""
					+ "Digite uma das opções abaixo:\n"
					+ "Moto\n" + "Helicoptero\n");

			if (typeTransportString.equals("moto")) {
				application.landTransport(landFactory);
			}
			else if (typeTransportString.equals("helicoptero")) {
				application.airTransport(landFactory);
			}else{
				throw new IllegalArgumentException("Escolha invalida! " + typeTransportString);
			}
			break;
		}
		case "MSC": {
			maritimeFactory = new MscTransport();
			String typeTransportString = JOptionPane.showInputDialog(""
					+ "Digite uma das opções abaixo:\n"
					+ "Balsa\n" + "Navio\n");
			
			if (typeTransportString.equals("balsa")) {
				application.waterTransport(maritimeFactory);
			}
			else if (typeTransportString.equals("navio")) {
				application.waterTransport(maritimeFactory);
			}else{
				throw new IllegalArgumentException("Escolha invalida! " + typeTransportString);
			}
			break;
			
		}
		default:
			System.err.println("Ocorreu um erro, verifique a opção digitada, e tente novamente");
		}
		
		return application;
	}
	
	public static void main(String[] args) {
		Application application = configApplication();
		application.startRoute();
	}
}
