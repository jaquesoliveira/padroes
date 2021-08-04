package padroes.decorator.model.decorators;

import padroes.decorator.Aviao;

public class Turbo extends AviaoDecorator {

	public Turbo(Aviao aviao) {
		super(aviao);
	}

	@Override
	public void acionarTurbina() {
		aviao.acionarTurbina();
		System.out.println("Adicionar turbo...");		
	}

	@Override
	public Double getVelocidade() {
		return aviao.getVelocidade()*1.8;
	}

	@Override
	public Double getTempoDeVoo(Double distancia) {
		return distancia / getVelocidade();
	}
}
