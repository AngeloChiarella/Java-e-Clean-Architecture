package escola.dominio.aluno;

public class CPF { // PADRÃO VALUE OBJECT (^N É UMA ENTIDADE)

	private String numero;

	public CPF(String numero) { // .matches fará a validação do CPF
		if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("CPF inválido!");
		}

		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

}
