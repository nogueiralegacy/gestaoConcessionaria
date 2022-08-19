package negocio;

public class TransacaoDeCompra extends Transacao {

    public TransacaoDeCompra(Cliente cliente, Concessionaria concessionaria, Veiculo veiculo, TransacaoStatus status,
            double montante, long id) {
        super(cliente, concessionaria, veiculo, status, montante, id);
    }
}
