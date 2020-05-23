import java.util.Scanner;

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArvoreDoJogo inicio;
		System.out.println("Olá amigo, vamos jogar um jogo interessante.");
		System.out.println("Pensa em um animal ao calhas e garanto te que advinho em qual estás a pensar");
		 
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
		 
		 //Perguntas a fazer
		 final String pergunta1 = "O seu habitat é a agua?"; //Golfinho ou baleia ou polvo.
	     final String pergunta2 = " O animal necessita de vir á superficie às vezes?"; // é o golfinho
	     final String pergunta3 = " O animal já ingoliu o pinócio?"; // É a baleia.
	     final String pergunta4 = "Tem tentaculos?"; // É o Polvo
	     
	     final String pergunta5 = "Quatro patas certo?"; //cao ou arminho
	     final String pergunta6 = "O animal está presente no filme 101 dalmatas?"; //cao
	     final String pergunta7 = "Hum...É um animal peculiar, branquinho e fofinho?"; //Arminho.
	     
	     final String pergunta8 = "É pequena?"; //Ou é a galinha, a rato.
	     final String pergunta9 = "O animal põe ovos?"; //Galinha
	     final String pergunta10 = "Reza a lenda que o bicharoco gosta de queijo?"; //É o rato
	     
	     
	     final String pergunta11 = "Corre bastante?"; //Ou é a zebra ou o cavalo
	     final String pergunta12= "Tem riscas?"; //É a zebra
	     final String pergunta13 = "É um animal presente no filme Spirit?"; // É o cavalo.
	     
	      
	     //Animais a adivinhar
	      final String ANIMAL1 = "zebra"; 
	      final String ANIMAL2 = "galinha";
	      final String ANIMAL3 = "pato";
	      final String ANIMAL4 = "cao";
	      final String ANIMAL5 = "arminho";
	      final String ANIMAL6 = "rato"; 
	      final String ANIMAL7 = "polvo"; //
	      final String ANIMAL8 = "cavalo"; 
	      final String ANIMAL9 = "golfinho"; //
	      final String ANIMAL10 = "baleia"; //
	      
	      //Construção da arvore binaria com as perguntas e respostas
	      	inicio = new ArvoreDoJogo(new Mensagem(pergunta1), null, null); //O inicio tem a pergunta 1
	      //Associar a pergunta1 às suas hipoteses da esquerda e direita.
	      	node1 = new ArvoreDoJogo(new Mensagem(pergunta4), node2, node3); 
	      	inicio.setNodeEsquerda(node1); //esta node1 está à esquerda do inicio e contem a pergunta4, node2 e node3
	      	
	      	//node3 corresponde a outro nó com o seguimento da pergunta para a direita.
	        node3 = new ArvoreDoJogo(new Mensagem(pergunta2),new ArvoreDoJogo(new Mensagem(ANIMAL9),null,null),
	        		new ArvoreDoJogo(new Mensagem(pergunta3),new ArvoreDoJogo(new Mensagem(ANIMAL10),null,null),null));
	        //resposta polvo
	      	node2 = new ArvoreDoJogo(new Mensagem(ANIMAL7),null,null);  //TODO O PERCURSO PARA A ESQUERDA DO INICIO.
	      	
	      	
	      	
		return inicio; 
	    

	      
	      

	      
	   }
}
