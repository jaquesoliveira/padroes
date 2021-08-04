package padroes.adapter2;

import padroes.adapter2.devices.PlugNovo;
import padroes.adapter2.interfaces.PadraoAntigo;

public class PlugAdapter implements PadraoAntigo{
	
	PlugNovo plugNovo;
	
	public PlugAdapter(PlugNovo plugNovo){
		this.plugNovo = plugNovo;
	}

	@Override
	public void fase() {
		System.out.println("Pino fase conectado");		
	}

	@Override
	public void neutro() {
		System.out.println("Pino neutro conectado");
	}
	
	public void terra() {
		System.out.println("este adaptador não tem pino de aterramento");
	}
	
	public void conectar() {
		fase();
		neutro();
		terra();
	}
}