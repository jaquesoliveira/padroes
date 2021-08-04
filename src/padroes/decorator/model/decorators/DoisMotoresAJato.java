package padroes.decorator.model.decorators;

import padroes.decorator.Aviao;

public class DoisMotoresAJato extends AviaoDecorator {

	public DoisMotoresAJato(Aviao aviao) {
		super(aviao);
	}

	@Override
	public void acionarTurbina() {
		aviao.acionarTurbina();
		System.out.println("Acionar duas turbinas..");
	}

	@Override
	public Double getVelocidade() {
		return aviao.getVelocidade() * 2.8;
	}

	@Override
	public Double getTempoDeVoo(Double distancia) {
		return distancia / getVelocidade();
	}
}
