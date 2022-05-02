package teste_sarah;

public class Main {
	
	public static void main(String[] args) throws Exception {
		//grupo canetas map (string, list) 
		// list<canetas> // cor igual
		Caneta c0 = new Caneta("padrão", "cis", true, "amarelo");
		Caneta c1 = new Caneta("padrão", "cis", true, "rosa");
		Caneta c2 = new Caneta("padrão", "cis", true, "verde");
		Caneta c3 = new Caneta("padrão", "cis", true, "laranja");
	
		Estojo2 e1 = new Estojo2(4);
		e1.abrir();
		e1.colocarMuitasCanetas(new Caneta[] {c0, c1, c2, c3, c2});
		e1.fechar();
		
		System.out.println(e1);
		
	}

}
