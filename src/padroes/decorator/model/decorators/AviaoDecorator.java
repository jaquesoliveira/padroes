package padroes.decorator.model.decorators;

import padroes.decorator.Aviao;

public abstract class AviaoDecorator implements Aviao {

	protected Aviao aviao;	
	
	public AviaoDecorator(Aviao aviao) {
		this.aviao = aviao;
	}
}
