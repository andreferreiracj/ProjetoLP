
public class ArvoreDoJogo<E> {
//atributos
	private Mensagem nodeAtual; //node com a mensagem principal
	private ArvoreDoJogo<E> esquerda; //node com a mensagem a percorrer para a esquerda
	private ArvoreDoJogo<E> direita; //node com a mensagem a percorrer para a direita
	
//Construtores
	 public ArvoreDoJogo(Mensagem m, ArvoreDoJogo<E> esquerda, ArvoreDoJogo<E> direita){
        this.nodeAtual = m;  
        this.esquerda = esquerda;
        this.direita = direita;
     }  
//Gets e sets
	public String getNodeAtual(){
		return this.nodeAtual.toString();
	}
	
	public void setNodeAtual(String m) {
		this.nodeAtual.setMensagem(m);
	}
	
	public ArvoreDoJogo<E> getEsquerda(){
		return this.esquerda;
	}
	
	public void setNodeEsquerda(String m){
		this.esquerda.setNodeAtual(m);
	}
	
	public ArvoreDoJogo<E> getDireita(){
		return this.direita;
	}
	
	public void setNodeDireita(String m){
		this.direita.setNodeAtual(m);
	}
	
	//comportamentos
}
