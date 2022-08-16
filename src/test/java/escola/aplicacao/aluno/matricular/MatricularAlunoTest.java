package escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import escola.academico.dominio.PublicadorEventos;
import escola.academico.dominio.aluno.Aluno;
import escola.academico.dominio.aluno.CPF;
import escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorioMemoria = new RepositorioDeAlunosEmMemoria();
		PublicadorEventos publicador = new PublicadorEventos();
		MatricularAluno useCase = new MatricularAluno(repositorioMemoria, publicador);

		MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "123.456.789-00", "fulano@email.com");

		useCase.executa(dados);

		Aluno encontrado = repositorioMemoria.findByCpf(new CPF("123.456.789-00"));
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());

	}

}
