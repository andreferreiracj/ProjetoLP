
public class Mensagem {
/*esta classe ir� guardar a mensagem da node na arvore bin�ria.
seja as perguntas de cada node, seja as respostas dos animais possiveis. */
	
		//atributos
	private String mensagem; 
		//construtores	
	public Mensagem() {
		super();
		this.mensagem = null;
	}

	public Mensagem(String mensagem) {
		this.mensagem = mensagem;
	}

		//gets e sets
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
		//ToString

	@Override
	public String toString() {
		return this.mensagem;
	}
		
}
