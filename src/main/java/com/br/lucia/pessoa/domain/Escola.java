package com.br.lucia.pessoa.domain;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Escola {
    private List<Professor> listaDeProfessor;
    private List<Aluno> listaDeAluno;

}
