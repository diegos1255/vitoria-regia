package br.com.vitoriaregia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SpringService {

	private List<String> nomes = new ArrayList<String>();
	
	/**
	 * Metodo que retorna uma lista de nomes
	 * @return
	 */
	public List<String> nomes() {
		
		this.nomes = new ArrayList<String>();
		this.nomes.add("Diego");
		this.nomes.add("Deyneson");
		
		return nomes;
	}
	
	/**
	 * Metodo responsavel por atualizar o nome na lista.
	 * @param nome
	 * @return
	 */
	public List<String> atualizaNomes(String nome) {
		
		this.nomes.add(nome);
		
		return nomes;
	}

	/**
	 * @return the nomes
	 */
	public List<String> getNomes() {
		return nomes;
	}

	/**
	 * @param nomes the nomes to set
	 */
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	
}
