

public abstract class Decoradores extends Desenhar {
	
	private Desenhar desenhar;
	
	public Decoradores(Desenhar desenhar) {
		this.setDesenhar(desenhar);
	}

	public Desenhar getDesenhar() {
		return desenhar;
	}

	public void setDesenhar(Desenhar desenhar) {
		this.desenhar = desenhar;
	}
	
}
