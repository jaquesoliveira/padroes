package padroes.adapter2.devices;

import padroes.adapter2.interfaces.PadraoNovo;

public class PlugNovo implements PadraoNovo{

	@Override
	public void fase() {
		System.out.println("Pino fase conectado");		
	}

	@Override
	public void neutro() {
		System.out.println("Pino neutro conectado");
	}

	@Override
	public void terra() {
		System.out.println("Pino terra conectado");
	}

}
