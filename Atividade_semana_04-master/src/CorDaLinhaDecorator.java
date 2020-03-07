import java.util.Random;

public class CorDaLinhaDecorator extends Decoradores {
	
	Random gerador = new Random();
	
	public CorDaLinhaDecorator(Desenhar desenhar) {
		super(desenhar);
		desenhar();
	}
		
	@Override
	public void desenhar() {
		int i = gerador.nextInt(3);
		if(i==1)
			System.out.println("Linha verde");
		else if(i==2)
			System.out.println("Linha vermelha");
		else if(i==3)
			System.out.println("Linha azul");
		else
			System.out.println("linha roxa");
	}
	
	
	
}
