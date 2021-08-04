package padroes.builder;

public class RefeicaoLight extends RefeicaoBuilder {
	
	@Override
	public void buidSaladaCrua() {
		refeicao.setSaladaCrua("Alface, tomate, cebola");
	}
	
	@Override
	public void buidPeitoDeFranfoGrelhado() {
		refeicao.setProteina("Peito de Frango Grelhado");
	}
	
	@Override
	public void buidSobremesa(){
		refeicao.setSobreMesa("Fruta");
	}
	
	@Override
	public void buidBebida() {
		refeicao.setBebida("Suco");
	}
}
