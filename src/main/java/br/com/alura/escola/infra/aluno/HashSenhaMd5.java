package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.HashSenha;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashSenhaMd5 implements HashSenha {

    @Override
    public String cifrarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("erro ao gerar o hash da senha", e);
        }
    }

    @Override
    public boolean validarSenhaHash(String hash, String senha) {
        return hash.equals(cifrarSenha(senha));
    }
}
