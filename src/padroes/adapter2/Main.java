package padroes.adapter2;

import padroes.adapter2.devices.PlugAntigo;
import padroes.adapter2.devices.PlugNovo;
import padroes.adapter2.devices.Tomada;

public class Main {
	
	public static void main(String[] args) {
		PlugAntigo plug = new PlugAntigo();
		
		System.out.println("--- Conexão de plug antigo com tomada antiga ---");
		Tomada tomadaA = new Tomada(plug);
		tomadaA.conectar();
		
		System.out.println();
		System.out.println("--- Conexão de plug novo com com adaptador  ---");
		PlugNovo plugNovo = new PlugNovo();
		PlugAdapter adapter = new PlugAdapter(plugNovo);
		adapter.conectar();
		
		System.out.println();
		System.out.println("--- Conexão do adaptador com tomada antiga ---");
		Tomada tomadaB = new Tomada(adapter);
		tomadaB.conectar();
		
//		System.out.println();
//		System.out.println("--- Conexão do adaptador com tomada antiga ---");
//		tomadaA = new Tomada(plugNovo);
//		tomadaA.conectar();
	}
}
