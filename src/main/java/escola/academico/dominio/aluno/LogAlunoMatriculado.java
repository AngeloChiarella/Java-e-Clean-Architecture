package escola.academico.dominio.aluno;

import java.time.format.DateTimeFormatter;

import escola.academico.dominio.Evento;
import escola.academico.dominio.Ouvinte;

public class LogAlunoMatriculado extends Ouvinte {

	@Override
	public void reageAo(Evento evento) {
		String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(String.format("Aluno de CPF %s matriculado em: %s",
				((AlunoMatriculado) evento).getCpfAluno(), momentoFormatado));
	}

	@Override
	protected boolean processar(Evento evento) {
		return evento instanceof AlunoMatriculado;
	}

}
