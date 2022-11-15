package br.com.alura.escola.dominio.aluno;

public interface HashSenha {
    String cifrarSenha(String senha);

    boolean validarSenhaHash(String hash, String senha);
}
