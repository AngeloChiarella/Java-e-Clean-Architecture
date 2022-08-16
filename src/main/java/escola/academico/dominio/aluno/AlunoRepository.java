package escola.academico.dominio.aluno;

import java.util.List;

import escola.shared.dominio.CPF;

public interface AlunoRepository {
	
	void matricular(Aluno aluno);
	
	Aluno findByCpf(CPF cpf);
	
	List<Aluno> findAll();

}
