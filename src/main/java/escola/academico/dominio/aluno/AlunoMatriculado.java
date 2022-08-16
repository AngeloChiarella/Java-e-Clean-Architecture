package escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import escola.shared.dominio.CPF;
import escola.shared.dominio.evento.Evento;
import escola.shared.dominio.evento.TipoDeEvento;

public class AlunoMatriculado implements Evento {

	private final CPF cpfDoAluno;
	private LocalDateTime momento;

	public AlunoMatriculado(CPF cpfAluno) {
		this.cpfDoAluno = cpfAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	public CPF getCpfAluno() {
		return cpfDoAluno;
	}

	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoes() {
		return Map.of("cpf", cpfDoAluno);
	}
}
