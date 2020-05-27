package projeto;

import java.util.Scanner;
///////////
///////////
///////////
///////////CONTADOR
///////////
///////////
///////////
///////////

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		 ArvoreDoJogo inicio;
		 //Apresentação
		    System.out.println("Olá amigo, vamos jogar um jogo interessante.");
            	    System.out.println("Pensa em um animal da minha lista: ");
                    System.out.println("== ZEBRA, GALINHA, CAO, ARMINHO, RATO, POLVO, CAVALO, GOLFINHO, BALEIA ==" );
                    System.out.println("Garanto-te que adivinho em qual estás a pensar");
		    inicio = inicio();
		    
		    //Lança uma Exception caso o utilizador escolha uma resposta em que o nó não tenha filhos
		    try {
		    do cicloDeJogo(inicio); while (darResposta(".  bora la outra vêz?"));
		    } catch (Exception e) {
		    	System.out.println("Hm..de momento não estou a conseguir adivinhar o teu animal.");
		   }
		 }
	
	public static void cicloDeJogo(ArvoreDoJogo jogo){
		//enquanto houverem nodes para percorrer
        while (!jogo.estaVazio()){
           if (darResposta(jogo.getNodeAtual()))
             jogo = jogo.getEsquerda();
           else
             jogo = jogo.getDireita();
        }
        System.out.print("É ESTE ANIMAL? Resposta: " + jogo.getNodeAtual().toString());
     }

	//funcao para o utilizador responder sim ou não à pergunta
     public static boolean darResposta(String i){
        String resposta;
        System.out.println(i + "[S ou N]: ");
        resposta = teclado.nextLine( ).toUpperCase( );
        while (!resposta.startsWith("S") && !resposta.startsWith("N")){
      System.out.println("Resposta invalida");
          resposta = teclado.nextLine( ).toUpperCase( );
        }return resposta.startsWith("S");

     }
	
	 public static ArvoreDoJogo inicio(){  //incompleto
		 //criação de nodes na arvore binaria
	     ArvoreDoJogo inicio = null;
		 ArvoreDoJogo node1= null;
		 ArvoreDoJogo node2 = null;
		 ArvoreDoJogo node3= null;
		 ArvoreDoJogo node4= null;
		 ArvoreDoJogo node5= null;
		 ArvoreDoJogo node6= null;
		 ArvoreDoJogo node7= null;
		 ArvoreDoJogo node8= null;
		 ArvoreDoJogo node9= null;
		 ArvoreDoJogo node10= null;
		 ArvoreDoJogo node11= null;
		 ArvoreDoJogo node12= null;
		 
		 //Perguntas a fazer
		 final String pergunta1 = "O animal em que está a pensar vive dentro de água?"; //Golfinho, baleia ou polvo.
	     final String pergunta2 = " O animal necessita de vir à superficie às vezes?"; // Resposta: Golfinho.
	     final String pergunta3 = " O animal é maior e mais pesado que um golfinho?"; // Resposta: baleia.
	     final String pergunta4 = "Tem tentaculos?"; // Resposta: Polvo
	     final String pergunta5 = "O animal tem quatro patas?"; //cao ou arminho
	     final String pergunta6 = "O animal é canino?"; //Resposta: cao
	     final String pergunta7 = "Hum...É um animal peculiar, branquinho e fofinho?"; //Resposta: Arminho.
	     final String pergunta8 = "O animal é pequeno?"; //Ou é a galinha, a rato.
	     final String pergunta9 = "O animal põe ovos?"; //Resposta: galinha
	     final String pergunta10 = "O animal adora queijo?"; //Resposta: rato
	     final String pergunta11 = "O animal corre bastante?"; //Ou é a zebra ou o cavalo
	     final String pergunta12= "O animal tem riscas?"; //Resposta: zebra
	     final String pergunta13 = "Serve para puxar carroças?"; // Resposta: cavalo
	     
	      
	     //Animais a adivinhar
	      final String ANIMAL1 = "Zebra"; 
	      final String ANIMAL2 = "Galinha";
	      final String ANIMAL4 = "Cao";
	      final String ANIMAL5 = "Arminho";
	      final String ANIMAL6 = "Rato"; 
	      final String ANIMAL7 = "Polvo"; //
	      final String ANIMAL8 = "Cavalo"; 
	      final String ANIMAL9 = "Golfinho"; //
	      final String ANIMAL10 = "Baleia"; //
	      
	     //Construção da arvore binaria com as perguntas e respostas
	      	inicio = new ArvoreDoJogo(new Mensagem(pergunta1), null, null); //O inicio tem a pergunta 1
	      //node3 corresponde a outro nó com o seguimento da pergunta para a direita.
	        node3 = new ArvoreDoJogo(new Mensagem(pergunta2),new ArvoreDoJogo(new Mensagem(ANIMAL9),null,null),
	        		new ArvoreDoJogo(new Mensagem(pergunta3),new ArvoreDoJogo(new Mensagem(ANIMAL10),null,null),null));
	        //resposta polvo
	      	node2 = new ArvoreDoJogo(new Mensagem(ANIMAL7),null,null); 
	      //Associar a pergunta1 às suas hipoteses da esquerda e direita.
	      	node1 = new ArvoreDoJogo(new Mensagem(pergunta4), node2, node3); 
	      	inicio.setNodeEsquerda(node1); //esta node1 está à esquerda do inicio e contem a pergunta4, node2 e node3
	      	
	      	 //TODO O PERCURSO PARA A ESQUERDA DO INICIO.
	      	
	      	
	      	//Começar para a direita do inicio.
	      		node4 = new ArvoreDoJogo(new Mensagem(pergunta5), null, null); 
	      		node5 = new ArvoreDoJogo(new Mensagem(pergunta6),new ArvoreDoJogo(new Mensagem(ANIMAL4),null,null), null);
	      		node4.setNodeEsquerda(node5); //na node4 colocamos um novo caminho para a esquerda
	      		inicio.setNodeDireita(node4); //iniciamos um novo caminho para a direita.
	      		
	      		
	      		node6 = new ArvoreDoJogo(new Mensagem(pergunta7),new ArvoreDoJogo(new Mensagem(ANIMAL5),null,null),null);
	      		node5.setNodeDireita(node6);
	      		node7 = new ArvoreDoJogo(new Mensagem(pergunta11),null,null);
	      		node6.setNodeDireita(node7);//caminho para a esquerda da node9
	      		node8 = new ArvoreDoJogo(new Mensagem(pergunta12),new ArvoreDoJogo(new Mensagem(ANIMAL1),null,null),null);
	      		node9= new ArvoreDoJogo(new Mensagem(pergunta13),new ArvoreDoJogo(new Mensagem(ANIMAL8),null,null),null);
	      		node8.setNodeDireita(node9); //caminho para a direita da node9
	      		
	      		node10 = new ArvoreDoJogo(new Mensagem(pergunta8),null,null);
	      		node4.setNodeDireita(node10); //vamos trabalhar agora no caminho para a direita da node4
	      		node11 = new ArvoreDoJogo(new Mensagem(pergunta9),new ArvoreDoJogo(new Mensagem(ANIMAL2),null,null),null);
	      		node10.setNodeEsquerda(node11);
	      		node12 = new ArvoreDoJogo(new Mensagem(pergunta10),new ArvoreDoJogo(new Mensagem(ANIMAL6),null,null),null);
	      		node9.setNodeDireita(node12); 
	      		//TODO O PERCURSO PARA A DIREITA DO INICIO
	      		
	      		
		return inicio; 
	    

	      
	      

	      
	   }
}
