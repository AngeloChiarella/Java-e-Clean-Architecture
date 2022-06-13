package escola;

import escola.aplicacao.aluno.matricular.MatricularAluno;
import escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulando da Silva";
		String cpf = "123.456.789-00";
		String email = "filano@email.com";

		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));
		
//		Aluno aluno = new Aluno(cpf, nome, email);
//		AlunoRepository repository = new RepositorioDeAlunosEmMemoria();
//		repository.matricular(aluno);
	}

}
