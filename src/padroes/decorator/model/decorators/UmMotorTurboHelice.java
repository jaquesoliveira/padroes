package padroes.decorator.model.decorators;

import padroes.decorator.Aviao;

public class UmMotorTurboHelice extends AviaoDecorator{
	
	public UmMotorTurboHelice(Aviao aviao) {
		super(aviao);
	}

	@Override
	public void acionarTurbina() {
		aviao.acionarTurbina();
		System.out.println("Acionando motor turbo hélice...");		
	}

	@Override
	public Double getVelocidade() {
		return aviao.getVelocidade() * 1.15;
	}

	@Override
	public Double getTempoDeVoo(Double distancia) {
		return distancia / getVelocidade();
	}
}
