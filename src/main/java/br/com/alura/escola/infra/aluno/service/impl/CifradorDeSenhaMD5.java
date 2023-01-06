package br.com.alura.escola.infra.aluno.service.impl;

import br.com.alura.escola.domain.aluno.service.CifradorDeSenha;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifradorDeSenhaMD5 implements CifradorDeSenha {

    @Override
    public String cifrarSenha(String senha) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] digest = messageDigest.digest(senha.getBytes());
        return new BigInteger(1, digest).toString(16);
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senha) throws NoSuchAlgorithmException {
        return senhaCifrada.equals(cifrarSenha(senha));
    }
}
