package negocio;

public class TransacaoDeCompra extends Transacao {

    public TransacaoDeCompra(Cliente cliente, Concessionaria concessionaria, Veiculo veiculo,
            double montante, long id) {
        super(cliente, concessionaria, veiculo, TransacaoStatus.COMPRA, montante, id);
    }
}
