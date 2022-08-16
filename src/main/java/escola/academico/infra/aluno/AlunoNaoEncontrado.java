package escola.academico.infra.aluno;

import escola.shared.dominio.CPF;

public class AlunoNaoEncontrado extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno de cpf (" + cpf.getNumero() + ") n�o foi encontrado!");
	}

}
