package escola.shared.dominio;

public class CPF { // PADR�O VALUE OBJECT (^N � UMA ENTIDADE)

	private String numero;

	public CPF(String numero) { // .matches far� a valida��o do CPF
		if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("CPF inv�lido!");
		}

		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}
	
	@Override
		public String toString() {
			return numero;
		}

}
