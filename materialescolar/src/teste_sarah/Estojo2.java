package teste_sarah;

public class Estojo2 {
	
	private Boolean aberto ;
	private Caneta[] canetas;
	
	public Estojo2(Integer capacidade) {
	    canetas = new Caneta[capacidade];
		this.aberto = false;
	}
	
	public void abrir() {
		this.aberto = true;
	}
	
	public void fechar() {
		this.aberto = false;
	}

	public void colocarCaneta(Caneta caneta) throws Exception {
		validar();
		
		Integer i = getSize();
		
		try {
			canetas[i] = caneta;
		} catch (Exception e) {
		 throw new Exception(" não cabe ");  
		}
	}
	
	private void validar() throws Exception {
		Boolean aberto = this.aberto;
		
		if(aberto == false) {
			throw new Exception("Não é possivel colocar caneta com estojo fechado");
		}
		
	}

	private Integer getSize(){

		Integer size = 0 ;

		for (int i = 0; i < canetas.length; i++) {

			Caneta value = canetas[i];

			if(value != null) {
				size++;
			}else {
				break;
			}
		}
		
		return size;
	}

	@Override
	public String toString() {
		
		Integer quantidade = getSize();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Canetas: " + quantidade );
		
		return sb.toString();
	}

	public void colocarMuitasCanetas(Caneta ... canetas) throws Exception {

		for(Caneta caneta : canetas) {
			colocarCaneta(caneta);
		}

	}

}
