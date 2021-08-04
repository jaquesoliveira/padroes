package padroes.builder;

public abstract class RefeicaoBuilder {

	protected Refeicao refeicao;

	public RefeicaoBuilder() {
		refeicao = new Refeicao();
	}

	public Refeicao getRefeicao() {
		return refeicao;
	}

	public void buidArroz() {

	}

	public void buidFeija() {

	}

	public void buidMacarrao() {

	}

	public void buidSaladaCrua() {

	}
	
	public void buidSaladaCozida() {

	}
	
	public void buidBife() {

	}
	
	public void buidAssadoDePanela() {

	}
	
	public void buidPeitoDeFranfoGrelhado() {

	}
	
	public void buidBebida() {

	}
	
	public void buidSobremesa(){

	}

}
