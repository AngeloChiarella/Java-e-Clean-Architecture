package escola.academico.dominio;

public abstract class Ouvinte {

	public void processa(Evento evento) {
		if (this.processar(evento)) {
			this.reageAo(evento);
		}
	}

	protected abstract void reageAo(Evento evento);

	protected abstract boolean processar(Evento evento);

}
