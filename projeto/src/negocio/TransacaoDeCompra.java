package negocio;

import java.time.LocalDateTime;

public class TransacaoDeCompra extends Transacao {

    public TransacaoDeCompra(Cliente cliente, Concessionaria concessionaria, Veiculo veiculo, TransacaoStatus status,
            LocalDateTime dataHora, double montante, long id) {
        super(cliente, concessionaria, veiculo, status, dataHora, montante, id);
    }
}
