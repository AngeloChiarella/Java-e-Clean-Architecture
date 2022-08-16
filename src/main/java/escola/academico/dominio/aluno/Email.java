package escola.academico.dominio.aluno;

public class Email { // PADR�O VALUE OBJECT (^N � UMA ENTIDADE)

	private String endereco;

	public Email(String endereco) { // .matches far� a valida��o do email
		if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail inv�lido!");
		}

		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
