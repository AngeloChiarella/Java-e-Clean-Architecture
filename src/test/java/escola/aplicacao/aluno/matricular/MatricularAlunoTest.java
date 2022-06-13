package escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.CPF;
import escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorioMemoria = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorioMemoria);

		MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "123.456.789-00", "fulano@email.com");

		useCase.executa(dados);

		Aluno encontrado = repositorioMemoria.findByCpf(new CPF("123.456.789-00"));
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());

	}

}
