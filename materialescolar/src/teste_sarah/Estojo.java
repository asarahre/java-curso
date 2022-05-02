package teste_sarah;

public class Estojo  {
	String cor;
	Integer quantidade;
	Integer capacidade;
	Boolean aberto;
	
	Estojo(Integer capacidade, Boolean aberto){
		this.capacidade = capacidade;
		this.aberto = aberto;
	}
	
	void status(){
		System.out.println("um estojo "+this.cor);
		System.out.println("quantidade de canetas"+this.quantidade);
		System.out.println("capacidade maxima de canetas  "+this.capacidade);
		System.out.println("meu estojo esta aberto "+this.aberto);
	}

	void adicionarcanetas(Caneta caneta) {
	}
	
	void encher(String[] vetor) throws Exception{
		
        if(this.aberto == false) {
			
			throw new Exception("seu estojo esta fechado");
		}
		
		if(this.capacidade < this.quantidade){
			
			throw new Exception("seu estajo esta cheio");
		} 
		
	}
	void abriFechar(){
		if(this.aberto==true ){
			this.aberto = false;
			System.out.println("este estojo foi fechado");    
		}
		else{
			this.aberto = true;
			System.out.println("este estojo foi aberto");
		}
	}
}