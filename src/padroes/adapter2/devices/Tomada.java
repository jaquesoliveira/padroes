package padroes.adapter2.devices;

import padroes.adapter2.interfaces.PadraoAntigo;

public class Tomada {

	PadraoAntigo conector;
	
	public Tomada(PadraoAntigo plug) {
		this.conector = plug;
	}
	
	public void conectar() {
		conector.fase();
		conector.neutro();				
	}
}