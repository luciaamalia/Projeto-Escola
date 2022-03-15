package com.br.lucia.pessoa.service.impl;

import com.br.lucia.pessoa.domain.Aluno;
import com.br.lucia.pessoa.domain.Pessoa;
import com.br.lucia.pessoa.domain.Professor;
import com.br.lucia.pessoa.domain.enums.EstadoCivil;
import com.br.lucia.pessoa.service.PessoaService;

import java.util.ArrayList;
import java.util.List;

public class PessoaServiceImpl implements PessoaService {

    public void teste(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lúcia");
        pessoa.setSobrenome("Amália");
        pessoa.setDocumento("12345");
        pessoa.setIdade(20);
        pessoa.setEstadoCivil(EstadoCivil.CASADO);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Valber");
        pessoa1.setSobrenome("Medeiros");
        pessoa1.setDocumento("56789");
        pessoa1.setIdade(27);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Lúcia");
        pessoa2.setSobrenome("Amália");
        pessoa2.setDocumento("12345");
        pessoa2.setIdade(20);
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Valber");
        pessoa3.setSobrenome("Medeiros");
        pessoa3.setDocumento("56789");
        pessoa3.setIdade(27);

        List<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa.add(pessoa);
        listaPessoa.add(pessoa1);
        listaPessoa.add(pessoa2);
        listaPessoa.add(pessoa3);

        Aluno aluno = new Aluno();




    }

    @Override
    public void printPessoa() {

    }

    @Override
    public void printAluno() {

    }

    @Override
    public void printProfessor() {

    }
}
