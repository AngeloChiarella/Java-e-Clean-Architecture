package escola.academico.aplicacao.aluno.matricular;

import escola.academico.dominio.aluno.Aluno;
import escola.academico.dominio.aluno.AlunoMatriculado;
import escola.academico.dominio.aluno.AlunoRepository;
import escola.shared.dominio.evento.PublicadorEventos;

public class MatricularAluno {
	
//	UseCase Clean Arch
	private final AlunoRepository repository;
	private final PublicadorEventos publicador;

	public MatricularAluno(AlunoRepository repository, PublicadorEventos publicador) {
		this.repository = repository;
		this.publicador = publicador;
	}
	
//	COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repository.matricular(novo);
		
		AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
		publicador.publicar(evento);
	}

	
}
