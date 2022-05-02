package com.github.asarahe;


public class Main {

	public static void main(String[] args) {
		Alimento frango = new Alimento("Frango");
		Alimento alface = new Alimento("Alface");
		Alimento agua = new Alimento("Agua");
		Alimento gelo = new Alimento("Gelo");


		Geladeira gel = new Geladeira("consul", 410);
		gel.adicionarAlimento(Geladeira.CONGELADOR, frango);
		gel.adicionarAlimento(Geladeira.GELADEIRA, alface);
		gel.adicionarAlimento(Geladeira.GELADEIRA, agua);
		gel.adicionarAlimento(Geladeira.CONGELADOR, gelo);
		
		System.out.println(gel.toString()); 
}	
	
}
