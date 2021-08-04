package padroes.builder.fluent;

public enum Opcoes {
	ARROZ("Arroz"),
	FEIJAO("Feijão"),
	MACARRAO("Macarrão"),
	SALADA_CRUA("Alface - Tomate - Cebola"),
	SALADA_COZIDA("Batata - Cenoura"),
	FRANGO_GRELHADO("Frango Grelhado"),
	BIFE("Bife"),
	ASSADO_DE_PANELA("ASSADO de Panela"),
	MACA("Maçã"),
	MAMAO("Mamão"),
	BANANA("Banana"),
	SUCO("Suco"),
	REFRIGERANTE("Refrigerante");
	
	private String descricao;

	private Opcoes(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
