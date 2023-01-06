package br.com.alura;

import br.com.alura.escola.aplication.aluno.dto.MatricularAlunoDto;
import br.com.alura.escola.aplication.aluno.service.MatricularAluno;
import br.com.alura.escola.infra.aluno.repository.impl.RepositorioDeAlunosEmMemoria;

import java.sql.*;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
//        try {
//            connectH2();
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        String nome = "José Henrique";
        String cpf = "123.456.789-00";
        String email = "fulano123@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.matricular(new MatricularAlunoDto(nome, cpf, email));
    }

    public static void connectH2() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        String jdbcUrl = "jdbc:h2:mem:test";
        String username = "sa";
        String password = "";

        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        String createTableAluno = "CREATE TABLE AlUNO(id int, cpf varchar(255), email varchar(255), nome varchar(255))";

        Statement statement = connection.createStatement();
        statement.execute(createTableAluno);

        connection.close();
    }
}
