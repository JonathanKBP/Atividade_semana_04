import java.util.Random;

public class Teste {
	
	public static void main(String[] args) {
		
		Desenhar d = null;
		Random gerador = new Random();
		int figura = gerador.nextInt(3);
		int decoracao = gerador.nextInt(3);
		int detalhe = gerador.nextInt(2);
		
		switch(figura) {
			case 0:
				d = new Quadrado();
				
				break;
			case 1:
				d = new Circulo();
				
				break;
			case 2:
				d = new Retangulo();
				
				break;
		}
		System.out.println(d.getDescription());
		switch(decoracao) {
		case 0:
			System.out.println("Não e decorado.");
			break;
		case 1:
			if(detalhe == 0) {
				d = new CorDaLinhaDecorator(d);
			}
			else {
				d = new CorDePreenchimentoDecorador(d);
			}
			break;
		case 2:
			d = new CorDaLinhaDecorator(d);
			d = new CorDePreenchimentoDecorador(d);
			break;
		}
		
		
	}

}
