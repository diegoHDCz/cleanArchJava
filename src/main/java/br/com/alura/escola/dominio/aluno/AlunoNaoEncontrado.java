package br.com.alura.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {

    private static final long serialVersionUID = 1566454080619859910L;

    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno não encontrado com CPF " + cpf.getNumero());
    }
}
