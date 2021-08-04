package padroes.builder;

public class Refeicao {
	
	private String arroz;
	
	private String feijao;
	
	private String macarrao;
	
	private String saladaCrua;
	
	private String saladaCozida; 
		
	private String proteina;
	
	private String bebida;
	
	private String sobreMesa;	
	
	public String getArroz() {
		return arroz;
	}

	public void setArroz(String arroz) {
		this.arroz = arroz;
	}

	public String getFeijao() {
		return feijao;
	}

	public void setFeijao(String feijao) {
		this.feijao = feijao;
	}

	public String getMacarrao() {
		return macarrao;
	}

	public void setMacarrao(String macarrao) {
		this.macarrao = macarrao;
	}

	public String getSaladaCrua() {
		return saladaCrua;
	}

	public void setSaladaCrua(String saladaCrua) {
		this.saladaCrua = saladaCrua;
	}

	public String getSaladaCozida() {
		return saladaCozida;
	}

	public void setSaladaCozida(String saladaCozida) {
		this.saladaCozida = saladaCozida;
	}

	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getSobreMesa() {
		return sobreMesa;
	}

	public void setSobreMesa(String sobreMesa) {
		this.sobreMesa = sobreMesa;
	}

	@Override
	public String toString() {
		return "Refeicao [arroz=" + arroz + ", feijao=" + feijao + ", macarrao=" + macarrao + ", saladaCrua="
				+ saladaCrua + ", saladaCozida=" + saladaCozida + ", proteina=" + proteina + ", bebida=" + bebida
				+ ", sobreMesa=" + sobreMesa + "]";
	}
	
	

}
