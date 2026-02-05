package application.port;

import domain.entity.model.Conta;

import java.util.List;

public interface ContaRepository {

    void salvar (Conta conta);

    Conta buscarPorNumero(String numero);

    List<Conta> listarPorCpf(String cpf);

}
