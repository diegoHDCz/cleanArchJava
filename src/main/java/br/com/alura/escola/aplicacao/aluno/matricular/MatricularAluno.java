package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioAlunos;

public class MatricularAluno {
    private final RepositorioAlunos repositorio;

    public MatricularAluno(RepositorioAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void matricular(MatricularAlunoDto dados) {
        Aluno novo = dados.criarMatricula();
        repositorio.matricular(novo);
    }
}
