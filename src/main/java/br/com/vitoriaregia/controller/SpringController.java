package br.com.vitoriaregia.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ("/teste")
public class SpringController {

	private List<String> nomes = new ArrayList<String>();
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/init", method=RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> teste() {
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		this.nomes = new ArrayList<String>();
		this.nomes.add("Diego");
		this.nomes.add("Deyneson");
		retorno.put("nomes", this.nomes);
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/atualizar", method=RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> atualizar(@RequestBody String param) {
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		
		for (String nome : this.nomes) {
			if (param.equals(nome)) {
				retorno.put("erro", "Nome j� existe na lista.");
				return new ResponseEntity<Map>(retorno, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		//se nome nao existe na lista, adiciona e devolve sucesso para tela.
		this.nomes.add(param);
		retorno.put("nomes", this.nomes);
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
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
