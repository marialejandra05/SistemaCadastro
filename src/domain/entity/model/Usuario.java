package domain.entity.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {

    private final String nome;
    private final String email;
    private final String cpf;

    private final List<Conta> contas = new ArrayList<>();

    public Usuario(String nome, String email, String cpf) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email é obrigatório.");
        }

        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF é obrigatório.");
        }

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public void adicionarConta(Conta conta) {

        if (conta == null) {
            throw new IllegalArgumentException("Conta inválida.");
        }

        contas.add(conta);
    }

    public List<Conta> getContas() {
        return Collections.unmodifiableList(contas);
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}





