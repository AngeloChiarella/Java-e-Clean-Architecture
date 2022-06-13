package escola.dominio.aluno;

import java.util.List;

public interface AlunoRepository {
	
	void matricular(Aluno aluno);
	
	Aluno findByCpf(CPF cpf);
	
	List<Aluno> findAll();

}
