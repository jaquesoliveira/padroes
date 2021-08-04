package padroes.decorator;

public class AviaoImpl implements Aviao {

	@Override
	public void acionarTurbina() {
		System.out.println("acionar um motor..");
	}

	@Override
	public Double getVelocidade() {
		return 150.00;
	}

	@Override
	public Double getTempoDeVoo(Double distancia) {		
		return distancia / getVelocidade();
	}
}
