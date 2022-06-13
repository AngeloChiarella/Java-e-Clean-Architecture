package escola.infra.indicacao;

import escola.aplicacao.indicacao.EnviarEmailIndicacao;
import escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoJavaMail implements EnviarEmailIndicacao{

	@Override
	public void enviarPara(Aluno indicado) {
		// Lógica de envio de emails com lib Java Mail
		indicado.getEmail();
		
	}

}
