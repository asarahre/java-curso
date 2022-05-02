package com.github.asarahe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Geladeira {

	public static String CONGELADOR = "congelador";  
	public static String GELADEIRA = "geladeira";  
	
	private String marca;
	private Integer litros;
	
	private Map<String, List<Alimento>> compartimentos = new HashMap<>();
	
	public Geladeira(String marca, Integer litros) {
		this.litros = litros;
		this.marca = marca;
		compartimentos.put(CONGELADOR, new ArrayList<>());
		compartimentos.put(GELADEIRA, new ArrayList<>());
	}

	
	public void adicionarAlimento(String compartimento, Alimento alimento) {
		
		List<Alimento> aliList = compartimentos.get(compartimento);
		
		aliList.add(alimento);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Alimentos na geladeira\n");
		
		for(String key : compartimentos.keySet()) {
			sb.append("Compartimento " + key + "\n");
			
			List<Alimento> aliList = compartimentos.get(key);
			
			for(Alimento ali : aliList) {
				String nome = ali.getNome();
				
				sb.append(nome + "\n");
			}
		}

		sb.append("--------------------------------------------\n");
		
		return sb.toString();
	}

}
