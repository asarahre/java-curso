package teste_sarah;

public class Caneta {
	public String tamanho;
	public String marca;
	public String cor;
	public Boolean temTinta;
	
	Caneta(String tamanho, String marca, Boolean temTinta, String cor) {
		this.tamanho = tamanho ;
		this.marca = marca;
		this.temTinta = temTinta;
		this.cor = cor;
	}
	
	public void status(){
		System.out.println("cor  " + this.cor);
		System.out.println("esta com tinta " + this.temTinta);
		System.out.println("marca" + this.marca);
		System.out.println("tamanho" + this.tamanho);
	}
	
	public void soltarTinta() throws Exception{
		if(this.temTinta==true ){
			System.out.println("solta tinta  ");    
		}
		else{
			throw new Exception("não tem tinta");
		}
	}
	
	public void adicionaTinta(){
		this.temTinta=true;

	}
	public void acabaTinta(){
		this.temTinta=false;
	}

}