package escola;

import escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import escola.academico.dominio.aluno.LogAlunoMatriculado;
import escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import escola.gamificacao.aplicacao.GeraSeloAlunoNovato;
import escola.gamificacao.infra.selo.RepositorioDeSeloEmMemoria;
import escola.shared.dominio.evento.PublicadorEventos;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {
		
		String nome = "Fulando da Silva";
		String cpf = "123.456.789-00";
		String email = "filano@email.com";

		MatricularAlunoDto dto = new MatricularAlunoDto(nome, cpf, email);

		PublicadorEventos publicador = new PublicadorEventos();
		publicador.adicionar(new LogAlunoMatriculado());
		publicador.adicionar(new GeraSeloAlunoNovato(new RepositorioDeSeloEmMemoria()));

		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.executa(dto);

	}

}
