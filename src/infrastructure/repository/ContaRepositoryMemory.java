package infrastructure.repository;

public class ContaRepositoryMemory {
    package infrastructure.repository;

import application.port.ContaRepository;
import domain.entity.model.Conta;

import java.util.ArrayList;
import java.util.List;

    public class ContaRepositoryMemory implements ContaRepository {

        private final List<Conta> contas = new ArrayList<>();

        @Override
        public void salvar(Conta conta) {
            contas.add(conta);
        }

        @Override
        public boolean existePorNumero(String numero) {
            return contas.stream()
                    .anyMatch(conta -> conta.getNumero().equals(numero));
        }

        @Override
        public Conta buscarPorNumero(String numero) {
            return contas.stream()
                    .filter(conta -> conta.getNumero().equals(numero))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public List<Conta> listar() {
            return new ArrayList<>(contas);
        }
    }

}
