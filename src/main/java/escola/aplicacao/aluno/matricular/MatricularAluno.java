package escola.aplicacao.aluno.matricular;

import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.AlunoRepository;

public class MatricularAluno {
//	UseCase Clean Arch
	private final AlunoRepository repository;

	public MatricularAluno(AlunoRepository repository) {
		this.repository = repository;
	}
//	COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repository.matricular(novo);
	}

	
}
