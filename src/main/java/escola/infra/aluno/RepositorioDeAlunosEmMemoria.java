package escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.AlunoRepository;
import escola.dominio.aluno.CPF;

public class RepositorioDeAlunosEmMemoria implements AlunoRepository {
	private List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);

	}

	@Override
	public Aluno findByCpf(CPF cpf) {
		return this.matriculados.stream().filter(a -> a.getCpf().equals(cpf.getNumero())).findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> findAll() {
		return this.matriculados;

	}

}
