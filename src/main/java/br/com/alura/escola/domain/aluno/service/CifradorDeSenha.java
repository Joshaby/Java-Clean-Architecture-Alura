package br.com.alura.escola.domain.aluno.service;

import java.security.NoSuchAlgorithmException;

public interface CifradorDeSenha {

    String cifrarSenha(String senha) throws NoSuchAlgorithmException;

    boolean validarSenhaCifrada(String senhaCifrada, String senha) throws NoSuchAlgorithmException;
}
