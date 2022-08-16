package escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import escola.academico.dominio.aluno.Aluno;
import escola.academico.dominio.aluno.CPF;
import escola.academico.dominio.aluno.Email;

class AlunoTest {

	private Aluno aluno;

	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno(new CPF("123.456.789-00"), "Fulano da Silva", new Email("fulano@email.com"));
	}

	@Test
	void devePermitirAdicionarTelefone1() {
		this.aluno.addTelefone("11", "999999999");
		assertEquals(1, this.aluno.getTelefones().size());
	}

	@Test
	void devePermitirAdicionarTelefone2() {
		this.aluno.addTelefone("11", "999999999");
		this.aluno.addTelefone("11", "888888888");
		assertEquals(2, this.aluno.getTelefones().size());
	}

	@Test
	void naoDevePermitirAdicionarTelefone3() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.aluno.addTelefone("11", "999999999");
			this.aluno.addTelefone("11", "888888888");
			this.aluno.addTelefone("11", "777777777");
		});
	}

}
