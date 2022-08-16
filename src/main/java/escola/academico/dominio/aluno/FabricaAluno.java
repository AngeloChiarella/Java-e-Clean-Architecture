package escola.academico.dominio.aluno;

import escola.shared.dominio.CPF;

public class FabricaAluno {

	private Aluno aluno;

	public FabricaAluno comNomeCpfEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}

	public FabricaAluno comTelefone(String ddd, String numero) {
		this.aluno.addTelefone(ddd, numero);
		return this;
	}

	public Aluno criar() {
		return this.aluno;
	}
}
