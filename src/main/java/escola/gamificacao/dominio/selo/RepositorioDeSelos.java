package escola.gamificacao.dominio.selo;

import java.util.List;

import escola.academico.dominio.aluno.CPF;

public interface RepositorioDeSelos {

	public void adicionar(Selo selo);

	List<Selo> selosDoAlunoDeCPF(CPF cpf);
	
}
