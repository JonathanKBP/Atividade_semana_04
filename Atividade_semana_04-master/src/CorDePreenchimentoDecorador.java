import java.util.Random;

public class CorDePreenchimentoDecorador extends Decoradores {

	Random gerador = new Random();
	
	public CorDePreenchimentoDecorador(Desenhar desenhar) {
		super(desenhar);
		desenhar();
	}

	@Override
	public void desenhar() {
		int i = gerador.nextInt(3);
		if(i==1)
			System.out.println("Preenchido de azul");
		else if(i==2)
			System.out.println("Preenchido de prata");
		else if(i==3)
			System.out.println("Preenchido de preto");
		else
			System.out.println("Preenchido de amarelo");
	}

}
