package com.br.lucia.pessoa.service.impl;

import com.br.lucia.pessoa.domain.Aluno;
import com.br.lucia.pessoa.domain.Escola;
import com.br.lucia.pessoa.domain.Professor;
import com.br.lucia.pessoa.domain.enums.EstadoCivil;
import com.br.lucia.pessoa.service.EscolaService;

import java.util.ArrayList;
import java.util.List;

public class EscolaServiceImpl implements EscolaService {

    @Override
    public void printEscola() {
        Escola escola = new Escola();

        List<Professor> listaProfessor = new ArrayList<>();
        Professor professor = new Professor();
        professor.setNome("José");
        professor.setDocumento("8763");
        professor.setSobrenome("Augusto");
        professor.setEstadoCivil(EstadoCivil.CASADO);
        professor.setIdade(43);

        Professor professor2 = new Professor();
        professor.setNome("Márcia");
        professor.setDocumento("2537");
        professor.setSobrenome("Silva");
        professor.setEstadoCivil(EstadoCivil.VIUVO);
        professor.setIdade(65);

        List<Aluno> listaAluno = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Claudio");
        aluno.setDocumento("234921");
        aluno.setSobrenome("Mario");
        aluno.setEstadoCivil(EstadoCivil.SOLTEIRO);
        aluno.setIdade(23);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Joana");
        aluno2.setDocumento("4885932");
        aluno2.setSobrenome("Carla");
        aluno2.setEstadoCivil(EstadoCivil.CASADO);
        aluno2.setIdade(27);

        listaProfessor.add(professor);
        listaProfessor.add(professor2);

        listaAluno.add(aluno);
        listaAluno.add(aluno2);

        escola.setListaDeAluno(listaAluno);
        escola.setListaDeProfessor(listaProfessor);

        System.out.println(escola);



    }
}
