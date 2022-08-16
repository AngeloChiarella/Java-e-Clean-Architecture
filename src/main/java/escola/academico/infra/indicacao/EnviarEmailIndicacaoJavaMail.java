package escola.academico.infra.indicacao;

import escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import escola.academico.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoJavaMail implements EnviarEmailIndicacao{

	@Override
	public void enviarPara(Aluno indicado) {
		// L�gica de envio de emails com lib Java Mail
		indicado.getEmail();
		
	}

}
