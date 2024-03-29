package escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import escola.academico.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
	}
}
