package escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import escola.academico.dominio.aluno.CPF;

class CpfTest {

	@Test
	void naoDeveCriarCpfInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new CPF(null));
		assertThrows(IllegalArgumentException.class, () -> new CPF(""));
		assertThrows(IllegalArgumentException.class, () -> new CPF("cpf invalido"));
	}

}
