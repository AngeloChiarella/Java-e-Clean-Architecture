package escola.infra.aluno;

import escola.dominio.aluno.CPF;

public class AlunoNaoEncontrado extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno de cpf (" + cpf.getNumero() + ") não foi encontrado!");
	}

}
