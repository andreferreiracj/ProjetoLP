
public class ArvoreDoJogo implements Metodos {
//atributos
	private Mensagem nodeAtual; //node com a mensagem principal
	private ArvoreDoJogo esquerda; //node com a mensagem a percorrer para a esquerda
	private ArvoreDoJogo direita; //node com a mensagem a percorrer para a direita
	
//Construtores
	 public ArvoreDoJogo(Mensagem m, ArvoreDoJogo esquerda, ArvoreDoJogo direita){
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
	
	public ArvoreDoJogo getEsquerda(){
		return this.esquerda;
	}
	
	public void setNodeEsquerda(ArvoreDoJogo n){
		this.esquerda = n;
	}
	
	public ArvoreDoJogo getDireita(){
		return this.direita;
	}
	
	public void setNodeDireita(ArvoreDoJogo n){
		this.direita = n;
	}
	
	
	//comportamentos
	
	
	@Override
	public void ordenar(){ //começar na esquerda da arvore binaria
	      if (esquerda != null)
	         esquerda.ordenar();
	      System.out.println(nodeAtual);
	      if (direita != null)
	         direita.ordenar();
	   }  
	
	@Override
	public boolean estaVazio() {
		return esquerda == null && direita==null;
	}
	
	@Override
	public void preorder() {//começar na root da arvore binaria.
		System.out.println(nodeAtual);
		if (esquerda != null)
	         esquerda.ordenar();
	      if (direita != null)
	         direita.ordenar();
	}
	
	@Override
	public void postordenar() {//Acabar na root.
		if (esquerda != null)
	         esquerda.ordenar();
	      if (direita != null)
	         direita.ordenar();
	      	System.out.println(nodeAtual); 
	}

	
	@Override
	public void consultar(int profundidade) {
	      int i;
	      for (i = 1; i <= profundidade; i++)
	         System.out.print("    ");
	      System.out.println(this.nodeAtual);

	      if (this.esquerda != null)
	    	  this.esquerda.consultar(profundidade+1);
	      else if (this.direita != null)
	      {
	         for (i = 1; i <= profundidade+1; i++)
	            System.out.print("    ");
	         System.out.println("--");
	      }

	      if (this.direita != null)
	         this.direita.consultar(profundidade+1);
	      else if (this.esquerda != null)
	      {
	         for (i = 1; i <= profundidade+1; i++)
	            System.out.print("    ");
	         System.out.println("--");
	      }
	   }
	
}
