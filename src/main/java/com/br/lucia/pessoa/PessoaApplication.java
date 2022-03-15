package com.br.lucia.pessoa;

import com.br.lucia.pessoa.domain.Escola;
import com.br.lucia.pessoa.service.impl.EscolaServiceImpl;
import com.br.lucia.pessoa.service.impl.PessoaServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PessoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PessoaApplication.class, args);
		EscolaServiceImpl escolaService = new EscolaServiceImpl();
		escolaService.printEscola();
	}

}
