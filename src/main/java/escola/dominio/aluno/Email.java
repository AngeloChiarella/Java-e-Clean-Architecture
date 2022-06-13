package escola.dominio.aluno;

public class Email { // PADRÃO VALUE OBJECT (^N É UMA ENTIDADE)

	private String endereco;

	public Email(String endereco) { // .matches fará a validação do email
		if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail inválido!");
		}

		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
