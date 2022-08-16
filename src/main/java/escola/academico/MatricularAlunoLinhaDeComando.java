package escola.academico;

import escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import escola.academico.dominio.PublicadorEventos;
import escola.academico.dominio.aluno.LogAlunoMatriculado;
import escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulando da Silva";
		String cpf = "123.456.789-00";
		String email = "filano@email.com";

		MatricularAlunoDto dto = new MatricularAlunoDto(nome, cpf, email);

		PublicadorEventos publicador = new PublicadorEventos();
		publicador.adicionar(new LogAlunoMatriculado());

		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.executa(dto);

	}

}
