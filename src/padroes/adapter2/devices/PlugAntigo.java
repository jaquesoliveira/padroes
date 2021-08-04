package padroes.adapter2.devices;

import padroes.adapter2.interfaces.PadraoAntigo;

public class PlugAntigo  implements PadraoAntigo{

	@Override
	public void fase() {
		System.out.println("Pino fase conectado");		
	}

	@Override
	public void neutro() {
		System.out.println("Pino neutro conectado");
	}
}
